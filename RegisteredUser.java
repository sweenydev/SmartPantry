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
	
	public void login(String username, String password)
	{
		
	}
	
	public void logout()
	{
		
	}
	
}