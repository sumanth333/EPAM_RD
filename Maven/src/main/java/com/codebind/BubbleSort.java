package com.codebind;

//This is a java program for implementation of bubble sort
public class BubbleSort
{
	//prints the array
	void printArray(int array[], int length)
	{
		for(int i=0; i<length; ++i)
					System.out.print(array[i]+" ");
		System.out.println();

	}

	//Bubble sort technique
	void bubbleSort(int array[], int length)
	{
		for(int i=0; i<length-1; ++i)
		{
			for(int j=0;j<length-i-1; ++j)
			{
				if(array[j] > array[j+1])
				{
					//swapping arr[j] and arr[j+1]
					array[j]   = array[j] ^ array[j+1];
					array[j+1] = array[j] ^ array[j+1];
					array[j]   = array[j] ^ array[j+1];
				}
			}
		}

	}

	//A Driver method to test bubble sort
	public static void main(String[] args)
	{

		//array initialization and length
		int array[] = {8,0,1,50,22,4};
		int length =  array.length;
		BubbleSort object = new BubbleSort();

		//printing unsorted array
		System.out.print("Before Sorting : ");
		object.printArray(array,length);

		//sorting
		object.bubbleSort(array, length);

		//printing sorted array
		System.out.print("After Sorting  : ");
		object.printArray(array,length);

		//closing or removing object
		object = null;
		System.gc();

	}

}
