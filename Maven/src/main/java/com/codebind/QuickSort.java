package com.codebind;

//This is a java program for implementing quick sort
public class QuickSort
{
	//This method prints the elements of array
	void printArray(int array[])
	{
		int length = array.length;
		for(int i=0; i<length; ++i)
			System.out.print(array[i]+" ");
		System.out.println();
	}

	/*
	 * This method takes last element as pivot
	 * After all it moves the pivot to its correct position
	 * The elements in array less than pivot will be placed left side of pivot
	 * and greater than pivot placed right side of pivot element in array
	 */
	int partition(int array[] , int left, int right)
	{
		//I am always selecting last element as pivot
		int pivot = array[right];
		int index = left-1;

		//quick sort logic to place < pivot elements to its left side
		// > pivot elements to its right side
		for(int j=left ;j<right; ++j)
		{
			if(array[j] <= pivot)
			{
				index++;
				//swapping a[index],a[j]
				int temp = array[index];
				array[index] = array[j];
				array[j] = temp;
			}
		}

		//swapping index,assumed pivot
		int temp = array[index+1];
		array[index+1] = array[right];
		array[right] = temp;

		return index+1;
	}
	/*
	 * It is an important function to implement quick sort
	 * This is a recursive function
	 * This function implements devide and conquer mechanism
	 */
	void quickSort(int array[],int left, int right)
	{
		if(left < right)
		{
			//initializing pivot element from partition techique
			int pivot = partition(array,left,right);

			//quickSort recursion technique
			quickSort(array,left,pivot-1);
			quickSort(array,pivot+1,right);
		}
	}
	public static void main(String[] args)
	{

		//Unsorted array
		int array[] = {7,0,1,8,22,4};
		int length =  array.length;

		//creating object to mergeSort class and calling method to sort
		QuickSort object = new QuickSort();

		System.out.print("Before Sorting : ");
		object.printArray(array);

		object.quickSort(array,0,length-1);


		//printing the sorted array
		System.out.print("After Sorting  : ");
		object.printArray(array);

		//closing or removing object
		object = null;
		System.gc();

	}

}
