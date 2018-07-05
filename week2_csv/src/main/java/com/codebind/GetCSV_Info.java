package com.codebind;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//This class is to get the details from a given csv file
public class GetCSV_Info 
{
	/*
	 * below is a contructor which retrieves the data from csv file
	 * and creates all objects to student class
	 * and add it to the student Data arrayList.
	 */
	GetCSV_Info(ArrayList<Student> studentsData)
	{
		BufferedReader reader;
		
		try
		{
			reader = new BufferedReader(new FileReader("src/main/resources/StudentsData.csv"));
			String line = reader.readLine();
			
			while(line != null)
			{
				String record[] = line.split(",");
				
				Student info = new Student();
				info.setFirstName(record[0]);
				info.setLasttName(record[1]);
				info.setBranch(record[2]);
				
				info.setID(Integer.parseInt(record[3]));
				info.setYearOfStudy(Integer.parseInt(record[4]));
				
				
				studentsData.add(info);
				line = reader.readLine();
			}
		}
		//To catch the exception if file not found
		catch(IOException element)
		{
			element.printStackTrace();
		}
		
	}
}
