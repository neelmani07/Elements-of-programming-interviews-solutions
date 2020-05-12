/*
A 64-bit integer can be viewed as an array of 64 bits, with the bit at
index 0 corresponding to the least significant bit, and the bit at index 63 corresponding
to the most significant bit Implement code that takes as input a 64-bit integer x and
swaps the bits at indices i and j.
*/
import java.util.*;
class SwapBits
{

	public void swap(int i,int j,long n)
	{
		System.out.println("n before swapping");
		System.out.println(Long.toBinaryString(n)); 
		long x=0;
		x=((n>>i)^(n>>j))&1;
		n^=(x<<i)|(x<<j);
		System.out.println("n after swapping");
		System.out.println(Long.toBinaryString(n)); 
		
	}
	public static void main(String a[])
	{
		SwapBits ob=new SwapBits();
		long n=10;
		int i=0,j=1;
		ob.swap(i,j,n);
	}
}

