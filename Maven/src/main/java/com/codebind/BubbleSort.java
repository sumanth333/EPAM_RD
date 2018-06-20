package com.codebind;

//This is a java program for implementation of bubble sort
public class BubbleSort
{
	//prints the array
	void printArray(int arr[], int length)
	{
		for(int i=0; i<length; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();

	}

	//Bubble sort technique
	void bubbleSort(int arr[], int length)
	{
		for(int i=0; i<length-1; ++i)
		{
			for(int j=0;j<length-i-1; ++j)
			{
				if(arr[j] > arr[j+1])
				{
					//swapping arr[j] and arr[j+1]
					arr[j]   = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j]   = arr[j] ^ arr[j+1];
				}
			}
		}

	}

	//A Driver method to test bubble sort
	public static void main(String[] args)
	{

		//array initialization and length
		int arr[] = {8,0,1,50,22,4};
		int length =  arr.length;
		BubbleSort obj = new BubbleSort();

		//printing unsorted array
		System.out.print("Before Sorting : ");
		obj.printArray(arr,length);

		//sorting
		obj.bubbleSort(arr, length);

		//printing sorted array
		System.out.print("After Sorting  : ");
		obj.printArray(arr,length);

		//closing or removing object
		obj = null;
		System.gc();

	}

}
