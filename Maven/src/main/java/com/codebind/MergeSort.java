package com.codebind;

//This is a java program for merge sort
public class MergeSort
{
	//Printing array
	void printArray(int array[])
	{
		int length = array.length;
		for(int i=0; i<length; ++i)
			System.out.print(array[i]+" ");
		System.out.println();
	}

	// Merges two sub arrays of array[].
    // First sub array is array[left..mid (length1)]
    // Second sub array is array[mid+1..right (length2)]
	void merge(int array[] , int left,int mid, int right)
	{

		//taking length of two arrays and initializing them
		int length1 = mid-left+1;
		int length2 = right-mid;

		int leftArray[] = new int[length1];
		int rightArray[] = new int[length2];

		for(int i=0;i<length1;++i)
			leftArray[i] = array[left+i];
		for(int j=0;j<length2;++j)
			rightArray[j] = array[mid+j+1];

		//comparing both arrays and fill the changed values in the merged array
		int i=0,j=0,k=left;
		while(i < length1 && j<length2)
		{
			if(leftArray[i] <= rightArray[j])
				array[k++] = leftArray[i++];
			else
				array[k++] = rightArray[j++];
		}

		//Merging left over array elements in merged array
		while(i <length1)
			array[k++] = leftArray[i++];
		while(j<length2)
			array[k++] = rightArray[j++];

	}
	// Main function that sorts array[left..right] using merge method
	void mergeSort(int array[],int left, int right)
	{
		if(left < right)
		{
			int mid = (left+right)/2;

			//merge sort recursion logic to split arrays
			mergeSort(array,left,mid);
			mergeSort(array,mid+1,right);

			//merging split arrays
			merge(array,left,mid,right);
		}
	}
	//Driver method to test the merge sort
	public static void main(String[] args)
	{
		//array initialization and length
		int array[] = {8,0,17,9,22,4};
		int length =  array.length;

		//creating object to MergeSort class
		MergeSort object = new MergeSort();

		//printing unsorted array
		System.out.print("Before Sorting : ");
		object.printArray(array);

		//calling mergeSort to sort array
		object.mergeSort(array,0,length-1);

		//printing sorted array
		System.out.print("After Sorting  : ");
		object.printArray(array);

		//closing or removing object
		object = null;
		System.gc();
	}

}
