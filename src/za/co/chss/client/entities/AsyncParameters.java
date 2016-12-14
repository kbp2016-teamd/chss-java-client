package za.co.chss.client.entities;

import java.util.ArrayList;

public class AsyncParameters
{
	public static final String REQUEST_TYPE = "request_type";
	public static final String REQUEST_TYPE_GET = "GET";
	public static final String REQUEST_TYPE_POST = "POST";
	
	public String requestType;
	public ArrayList<NameValPair> parameters;
	public String url;
}