package com.codebind;

import java.util.Scanner;

/*
 * THis is the main method where the program starts
 * Main method provides the facility to chose search or sort 
 * after each sort and search the result will get displayed
 */
public class Main 
{
	public static void main(String args[])
	{
	
		SearchOrSort operation = new SearchOrSort();
		Scanner scan = new Scanner(System.in);
		int choice=3;
		do
		{
			System.out.println("\nSelect your operation: ");
			System.out.println("1.Search \t 2.Sort \t 3.Exit");
			
			choice = scan.nextInt();
			switch(choice)
			{
				case 1: System.out.println("Enter search key: ");
						operation.search(scan.next().toUpperCase());break;
				
				case 2: System.out.println("Enter Sort by value:\n1.First name\t2.Last name\t3.Branch\t4.Student ID\t5.Year of Study");
						operation.sort(scan.nextInt());break;
			}
			
		}while(choice!=3);
		
		scan.close();
	}
}