package com.codebind;

//This is a student class for the details of each student
public class Student 
{
	//This instance variables will hold the details of student
	private String firstName,lastName,branch;
	private int studentID,yearOfStudy;
	
	//since instant variables private I have used setter and getter methods 
	//setter and getter methods for first name
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	//setter and getter methods for last name
	public void setLasttName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	//setter and getter methods for branch
	public void setBranch(String branch)
	{
		this.branch = branch;
	}
	public String getBranche()
	{
		return branch;
	}
	
	//setter and getter methods for ID
	public void setID(int studentID)
	{
		this.studentID = studentID;
	}
	public int getstudentID()
	{
		return studentID;
	}
	
	
	//setter and getter methods for year of study
	public void setYearOfStudy(int yearOfStudy)
	{
		this.yearOfStudy = yearOfStudy;
	}
	public int getYearOfStudy()
	{
		return yearOfStudy;
	}
	
	//This is a method to print a formatted string with spaces
	public void printTuple()
	{
		System.out.printf("%-15s%-15s%-10s%-8d%-5d\n", firstName,lastName,branch,studentID,yearOfStudy);
	}
	
	//this method returns the total tupple as a string
	public String toString()
	{
		return firstName+" "+lastName+" "+branch+" "+studentID+" "+yearOfStudy;
	}
}
