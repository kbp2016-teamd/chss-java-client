package za.co.chss.client.lib;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;

import za.co.chss.client.entities.AsyncParameters;
import za.co.chss.client.entities.DataClass;

public class DownloadDataTask
{
	private URL service;
	private HttpURLConnection client;
	private String data; //String to temporarily capture each line that is read from response content
	private String newLine; //Creates new line in StringBuffer after writing each line of data
	/*stores server responses as an Arraylist to accommodate the case of more that one parameter needing to be processed*/
	private String result = null;
	private final String HOST_ADDRESS = "http://apichss.azurewebsites.net/api/"; //The base url for all server calls
	private BufferedReader httpStreamInputReader; /*Reader that will be used to extract the data from the server response*/
	int code;
	StringBuffer httpContent;
	
	public String doInBackground(AsyncParameters... asyncParams)
	{
		httpStreamInputReader = null;
        String newLine = System.getProperty("line.separator"); //used to make white_box_blue_outline new line as data is read
        
	    try
	    {
			AsyncParameters asyncParam = asyncParams[0];
			String param = asyncParam.url.replace(" ", "%20");

			String urlParameters = DataClass.formatParameters(asyncParam.parameters, asyncParam.requestType);

			if(asyncParam.requestType.equalsIgnoreCase(AsyncParameters.REQUEST_TYPE_POST)) {
                service = new URL(HOST_ADDRESS+param);

                httpContent = new StringBuffer("");
                client = (HttpURLConnection) service.openConnection();
                client.setRequestMethod(asyncParam.requestType);
				client.setConnectTimeout(5000);
                client.setRequestProperty("Content-Type", "application/json; charset=utf-8");

                client.setDoOutput(true);
                DataOutputStream wr = new DataOutputStream(client.getOutputStream());
                wr.writeBytes(urlParameters);
                wr.flush();
                wr.close();
            }
            else
            {
                service = new URL(HOST_ADDRESS+param+"?"+urlParameters.replace(" ", "%20"));

                httpContent = new StringBuffer("");
                client = (HttpURLConnection) service.openConnection();
				client.setConnectTimeout(5000);
                client.setRequestMethod(asyncParam.requestType);
            }

			client.connect();

	        httpStreamInputReader = new BufferedReader(new InputStreamReader(client.getInputStream()));

			code = client.getResponseCode();

	        data = "";
	        while((data = httpStreamInputReader.readLine()) !=null)
	        {
	            httpContent.append(data).append(newLine);
	        }
	        result = httpContent.toString();
			
	        httpStreamInputReader.close();
	        
	        return result;
	    }
		catch (SocketTimeoutException e)
		{
			e.printStackTrace();
			return null;
		}
	    catch(Exception e)
	    {
			e.printStackTrace();
	    	return null;
	    }
	}
}