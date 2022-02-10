package com;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		call();

	}
	static void call()
	{
	User.display();	
	}

}
class User
{
	int userId=10;
	static String courseName = "JFS";
	
	void show()
	{
		System.out.println("display user info");
	}
	static void display()
	{
	User usr=new User();
	System.out.println(usr.userId);
	System.out.println(courseName);
	
	}
}
