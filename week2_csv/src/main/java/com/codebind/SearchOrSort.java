package com.codebind;

import java.util.ArrayList;
import java.util.Arrays;

//This class is where all the operations will get takes place

public class SearchOrSort 
{
	ArrayList<Student> studentsData;
	int noOfStudents;
	int indexArray[];
	/*
	 * This is a constructor 
	 * which calls the csv constructor to store the details from file
	 * and displays the csv details
	 */
	SearchOrSort()
	{
		studentsData = new ArrayList<Student>();
		new GetCSV_Info(studentsData);
		
		System.gc();
		noOfStudents = studentsData.size();
		indexArray = new int[noOfStudents];
		for(int i=0;i<noOfStudents;++i)
			indexArray[i] = i;
		
		displayRecords();
	}
	/*
	 * Below method is to sort the tuples(records)
	 * based on the chosen index 
	 * I have used bubble sort technique to sort he tuples
	 * it display the tuple based on the indexes of indexArray
	 */
	public void sort(int sortBy)
	{
		if(sortBy>0 && sortBy <6)
		{
			String compareTuples[] = new String[noOfStudents];
			String tuple ;
			
			for(int i=0;i<noOfStudents;++i)
			{
				indexArray[i] = i;
				tuple = studentsData.get(i).toString();
				compareTuples[i] = tuple.split(" ")[sortBy-1]+tuple;
			}
			
			for(int i=0;i<noOfStudents-1;++i)
			{
				for(int j=0; j<noOfStudents-i-1;++j)
				{
					if(compareTuples[j].compareTo(compareTuples[j+1]) >0)
					{
						String temp1 = compareTuples[j];
						compareTuples[j] = compareTuples[j+1];
						compareTuples[j+1] = temp1;
						
						int temp2;
						temp2 = indexArray[j];
						indexArray[j] = indexArray[j+1];
						indexArray[j+1] = temp2;
						
					}
				}
			}
			displayRecords();
		}
	}
	/*
	 * Below method is to search the string given by user
	 * by using collections method contains 
	 */
	public void search(String key)
	{
		boolean found = false;
		for(int i=0;i<noOfStudents;++i)
		{
			String words[] = studentsData.get(indexArray[i]).toString().toUpperCase().split(" ");
			ArrayList<String> wordListOfRecord = new ArrayList<String> (Arrays.asList(words));
			if(wordListOfRecord.contains(key))
			{
				studentsData.get(indexArray[i]).printTuple();
				found = true;
			}
		}
		if(!found)
		{
			System.out.println("No details found...");
		}
	}
	/*
	 * below method is to display records based on the previously sorted values
	 */
	public void displayRecords()
	{
		for(int i=0;i<noOfStudents;++i)
		{
			studentsData.get(indexArray[i]).printTuple();
		}
	}
}
