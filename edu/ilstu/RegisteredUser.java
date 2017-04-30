package edu.ilstu;

import java.util.List;

public class RegisteredUser extends User
{

	private static int userIDCount = 1;
	private int userID;
	private String username;
	private String password;
	private List<RegisteredUser> friendList;
	private List<MealPosting> myPostings;
	private List<MealPosting> socialPostings;
	
	
	
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
	
	
	public void addFriend(String userName)
	{
		RegisteredUserDA userList = new RegisteredUserDA();
		RegisteredUser newFriend = userList.getUser(userName);
		friendList.add(newFriend);
		
	}
	
	public void removeFriend(String userName)
	{
		List<RegisteredUser> friendList = this.friendList;
		for(int userCount = 0; userCount < friendList.size(); userCount++)
		{
			if(friendList.get(userCount).getUsername().equals(userName))
			{
				this.friendList.remove(userCount);
			}
		}
	}

	public void logout()
	{
		
	}
	
}