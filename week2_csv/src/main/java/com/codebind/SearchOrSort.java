package com.codebind;

import java.util.ArrayList;

public class SearchOrSort 
{
	ArrayList<Student> studentsData;
	SearchOrSort()
	{
		studentsData = new ArrayList<Student>();
		new GetCSV_Info(studentsData);
		
		System.gc();
	}
	public void sort()
	{
		
	}
	public void search()
	{
		
	}
	public void displayRecords()
	{
		for(int i=0;i<studentsData.size();++i)
		{
			System.out.println(studentsData.get(i).getTuple());
		}
	}
}
