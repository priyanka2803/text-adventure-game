package com.adventuregames;


public class User
{
	private String name;
	private String gender;
	private String astroSign;
	private int health;

	public User()
	{
		health=100;
	}
	public User(String name,String gender,String astroSign)
	{
		this.name = name;
		this.gender = gender;
		this.astroSign = astroSign;
		health=100;
	}
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int health)
	{
			this.health=health;	
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getGender()
	{
		return gender;
	}
	public void setAstroSign(String astroSign)
	{
		this.astroSign = astroSign;
	}
	public String getAstroSign()
	{
		return astroSign;
	}
	public String toString()
	{
		return "Name = "+name+" Gender = "+gender+" Astro Sign = "+astroSign;
	}

};