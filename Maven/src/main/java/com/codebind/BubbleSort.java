package com.codebind;
import java.util.Scanner;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		//initializing scanner
		Scanner scan = new Scanner(System.in);
		
		//array initialization and length
		int arr[] = {8,0,1,5,22,4};
		int length =  arr.length;
		
		//printing unsorted array
		System.out.print("Before Sorting : ");
		for(int i=0;i<length;++i)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		//Bubble sort technique
		for(int i=0; i<length-1; ++i)
		{
			for(int j=0;j<length-i-1; ++j)
			{
				if(arr[j] > arr[j+1])
				{
					arr[j]   = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j]   = arr[j] ^ arr[j+1];
				}
			}
		}
		
		//printing sorted array
		System.out.print("After Sorting  : ");
		for(int i=0;i<length;++i)
			System.out.print(arr[i]+" ");
		System.out.println();
		
	}

}
