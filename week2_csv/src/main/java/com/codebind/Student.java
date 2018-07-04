package com.codebind;

public class Student 
{
	private String firstName,lastName,branch;
	private int studentID,yearOfStudy;
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLasttName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	public void setBranch(String branch)
	{
		this.branch = branch;
	}
	public String getBranche()
	{
		return branch;
	}
	
	public void setID(int studentID)
	{
		this.studentID = studentID;
	}
	public int getstudentID()
	{
		return studentID;
	}
	
	public void setYearOfStudy(int yearOfStudy)
	{
		this.yearOfStudy = yearOfStudy;
	}
	public int getYearOfStudy()
	{
		return yearOfStudy;
	}
	
	public String getTuple()
	{
		return firstName+" "+lastName+" "+branch+" "+studentID+" "+yearOfStudy;
	}
}
