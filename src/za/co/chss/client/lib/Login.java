package za.co.chss.client.lib;

import za.co.chss.client.entities.DataClass;
import za.co.chss.client.entities.User;

public class Login {

	public boolean login(User user)
	{
		DataClass.login(user);
		
		return true;
	}
}