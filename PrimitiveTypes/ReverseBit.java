/*
: Write a function that takes a 64-bit integer x and returns a 64-bit integer
consisting of the bits of x in reverse order.
*/
import java.util.*;
class ReverseBit
{
	static long n=10;
	public long swap(int i,int j)
	{
		
		long x=0;
		x=((n>>i)^(n>>j))&1;
		n^=(x<<i)|(x<<j);
		return n;
		
		
	}
	public static void main(String a[])
	{
		ReverseBit ob=new ReverseBit();
		//long n=10;
		int i=0,j=63;
		System.out.println("n before swapping");
		System.out.println(Long.toBinaryString(n)); 
		while(i<32)
		{
			ob.swap(i,j);
			i++;j=63-i;
		}
		System.out.println("n after swapping  mind that starting zeros are always hidden");
		System.out.println(Long.toBinaryString(n)); 
	}
}

