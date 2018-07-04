package com.codebind;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GetCSV_Info 
{
	GetCSV_Info(ArrayList<Student> studentsData)
	{
		BufferedReader reader;
		
		try
		{
			reader = new BufferedReader(new FileReader("src/main/resources/StudentsData.csv"));
			String line = reader.readLine();
			String record[] = line.split(",");
			
			Student info = new Student();
			info.setFirstName(record[0]);
			info.setLasttName(record[1]);
			info.setBranch(record[2]);
			
			info.setID(Integer.parseInt(record[3]));
			info.setYearOfStudy(Integer.parseInt(record[4]));
			
			
			studentsData.add(info);
		}
		catch(IOException element)
		{
			element.printStackTrace();
		}
		
	}
}
