package com.codebind;

import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		System.out.println("hello");
	
		SearchOrSort operation = new SearchOrSort();
		Scanner scan = new Scanner(System.in);
		int choice=3;
		do
		{
			System.out.println("Select your operation: ");
			System.out.println("1.Search \t 2.Sort \t 3.Exit");
			
			choice = scan.nextInt();
			switch(choice)
			{
				case 1: operation.search();break;
				case 2: operation.sort();break;
			}
			
		}while(choice!=3);
		
		scan.close();
	}
}