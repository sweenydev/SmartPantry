public class RegisteredUser extends User
{

	private static int userIDCount = 1;
	private int userID;
	private String username;
	private String password;
	
	public RegisteredUser(String name, String pass)
	{
		userID = userIDCount;
		userIDCount++;
		username = name;
		password = pass;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public int getUserID()
	{
		return userID;
	}
	
	public boolean login(String password)
	{
		if(this.password.equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void logout()
	{
		
	}
	
}