import java.util.*;
class PalendromicDecomposition
{
	public static void decompose(String s)
	{	int bck=0,frnt=0;
		
		//odd length palindrome
		for(int i=1;i<s.length()-1;i++)
		{
			bck=i;frnt=i;
			while(s.charAt(bck)==s.charAt(frnt))
			{	if((bck-1) < 0 || (frnt+1) >= s.length())
				{	
					break;
				}
				bck--;
				//System.out.print(bck);
				frnt++;
			}
			System.out.print(" "+s.substring(bck+1,frnt));
		}
		
		//even length palindrome
		for (int b=0,f=0;b>=0 && f<s.length();f++,b++)
		{
			while(s.charAt(b) == s.charAt(f))
			{
				if(b-1<0 || f+1>s.length())
					break;
				b--;f++;
			}
			System.out.print(" "+s.substring(b+1,f));
		}
			
	}
	
	public static void main(String s[])
	{
		decompose("66111666");
	}
}
