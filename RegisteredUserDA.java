import java.util.ArrayList;

public class RegisteredUserDA
{
	private ArrayList<RegisteredUser> userList;
	private int currentUser;
	
	public RegisteredUserDA()
	{
		userList = new ArrayList<RegisteredUser>();
	}
	
	public void createAccount(String username, String password)
	{
		if(getUser(username) == null)//Confirms the username is not taken
		{
			RegisteredUser newUser = new RegisteredUser(username, password);
			userList.add(newUser);
		}
	}
	
	public boolean login(String username, String password)
	{
		RegisteredUser tempUser = getUser(username);
		
		if(tempUser != null)
		{
			if(tempUser.login(password))
			{
				currentUser = tempUser.getUserID();
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public void logout()
	{
		currentUser = 0;
	}
	
	public RegisteredUser getUser(String username)
	{
		for(int userCount = 0; userCount < userList.size(); userCount++)
		{
			if(userList.get(userCount).getUsername().equals(username))
			{
				return userList.get(userCount);
			}
		}
		return null;//Returns nothing if there are no matches
	}
}
