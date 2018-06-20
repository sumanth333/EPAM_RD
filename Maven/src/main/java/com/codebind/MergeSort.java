package com.codebind;

public class MergeSort
{
	void printArray(int arr[])
	{
		int length = arr.length;
		for(int i=0; i<length; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	void merge(int arr[] , int left,int mid, int right)
	{

		//taking length of two arrays and initializing them
		int len1 = mid-left+1;
		int len2 = right-mid;

		int L[] = new int[len1];
		int R[] = new int[len2];

		for(int i=0;i<len1;++i)
			L[i] = arr[left+i];
		for(int j=0;j<len2;++j)
			R[j] = arr[mid+j+1];

		//comparing both arrays and fill the changed values in the merged array
		int i=0,j=0,k=left;
		while(i < len1 && j<len2)
		{
			if(L[i] <= R[j])
				arr[k++] = L[i++];
			else
				arr[k++] = R[j++];
		}

		//Merging left over array elements in merged array
		while(i <len1)
			arr[k++] = L[i++];
		while(j<len2)
			arr[k++] = R[j++];

	}
	void mergeSort(int arr[],int left, int right)
	{
		if(left < right)
		{
			int mid = (left+right)/2;

			//merge sort recursion logic to split arrays
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);

			//merging splitted arrays
			merge(arr,left,mid,right);
		}
	}
	public static void main(String[] args)
	{
		//array initialization and length
		int arr[] = {8,0,17,9,22,4};
		int length =  arr.length;

		//creating object to MergeSort class
		MergeSort obj = new MergeSort();

		//printing unsorted array
		System.out.print("Before Sorting : ");
		obj.printArray(arr);

		//calling mergeSort to sort array
		obj.mergeSort(arr,0,length-1);

		//printing sorted array
		System.out.print("After Sorting  : ");
		obj.printArray(arr);
		obj.close();
	}

}
