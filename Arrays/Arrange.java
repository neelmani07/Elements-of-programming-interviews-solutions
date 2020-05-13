/*
Write a function that takes an array A and an index i into A, and
rearranges the elements such that all elements less than A[i] appear first, followed
by elements equal to A[i], followed by elements greater than A[i]. Your algorithm
should have 0(1) space complexity and OOAI) time complexity.
*/
import java.util.*;
class Arrange
{
	public static void arrangeArray1(int []ar,int ind)//O(N) space
	{
		int result[]=new int[ar.length];
		int smaller=0,larger=ar.length-1;
		int k=ar[ind];int countSame=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] < k)
			{
				result[smaller]=ar[i];
				smaller++;
			}
			if(ar[i] > k)
			{
				result[larger]=ar[i];
				larger--;
			}
			if(ar[i] == k)
				countSame++;
		}
		for(int i=1;i<= countSame;i++)
		{
			result[larger]=k;
			larger--;
		}
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(result[i]+" ");
		}
					
	}
	public static void swap(int ar[],int i,int j)
	{
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		
	}
	public static void arrangeArray2(int []A,int ind)//O(1) space
	{
		int smaller = 0, equal = 0, larger =A.length- 1;
		int pivot=A[ind];
		while (equal <= larger)
		{
		
			
			if (A[equal] < pivot)
			{
				swap(A,smaller, equal);
				smaller++;equal++;
			}
			else if (A[equal]== pivot)
			{
				++equal;
			}
			else
			{ 
				
				swap(A,equal,larger--);
			}
		}
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
	public static void main(String s[])
	{
		int ar[]=new int[]{4,3,5,2,7,9,5,6,1,5}; 
		
		
		System.out.println();System.out.println();
		arrangeArray2(ar,2);
	}
}
