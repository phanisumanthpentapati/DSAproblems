import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		
		while(a-->  0)
		{
		    int n=sc.nextInt();
		    
		    
		    if(n == 0)
		       return ;
		    
		    String s=sc.next();
		    int c1=0;
		    int c2=0;
		    
		    
		    for(int i=0;i<n;i++)
		    {
		        if(s.charAt(i) == '0')
		          c1++;
		        else
		          c2++;
		    }
		    
	        if(c1 == c2)
		    {
		        System.out.println("yes");
		    }
		    else
		    {
		        if(((c1 &1) == 1) && ((c2 & 1) ==1))
		        System.out.println("no");
		        
		  else
		        System.out.println("yes");
		    }
		}
		

	}
}
