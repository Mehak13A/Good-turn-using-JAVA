/* package codechef; // don't place package name! */

import java.util.*;

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Cook
{
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++)
		{
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    if((X + Y) > 6)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
	    }
    }
}