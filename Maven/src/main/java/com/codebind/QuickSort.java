package com.codebind;

public class QuickSort
{
	void printArray(int arr[])
	{
		int length = arr.length;
		for(int i=0; i<length; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	int partition(int arr[] , int left, int right)
	{
		//I am always selecting last element as pivot
		int pivot = arr[right];
		int index = left-1;

		//quick sort logic to place < pivot elements to its left side
		// > pivot elements to its right side
		for(int j=left ;j<right; ++j)
		{
			if(arr[j] <= pivot)
			{
				index++;
				//swapping a[index],a[j]
				int temp = arr[index];
				arr[index] = arr[j];
				arr[j] = temp;
			}
		}

		//swapping index,assumed pivot
		int temp = arr[index+1];
		arr[index+1] = arr[right];
		arr[right] = temp;

		return index+1;
	}
	void quickSort(int arr[],int left, int right)
	{
		if(left < right)
		{
			//initializing pivot element from partition techique
			int pivot = partition(arr,left,right);

			//quickSort recursion technique
			quickSort(arr,left,pivot-1);
			quickSort(arr,pivot+1,right);
		}
	}
	public static void main(String[] args)
	{

		//Unsorted array
		int arr[] = {8,0,1,9,22,4};
		int length =  arr.length;

		//creating object to mergeSort class and calling method to sort
		QuickSort obj = new QuickSort();

		System.out.print("Before Sorting : ");
		obj.printArray(arr);

		obj.quickSort(arr,0,length-1);


		//printing the sorted array
		System.out.print("After Sorting  : ");
		obj.printArray(arr);
		obj.close();

	}

}
