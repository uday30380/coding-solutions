import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    Scanner scanner = new Scanner(System.in);
	    int n=scanner.nextInt();
	    
	    if(n>=20&&n<=29){
	        System.out.println(30-n);
	    }
	    else if(n>=30&&n<=39){
	        System.out.println(40-n);
	    }
	    else
	    {
	        System.out.println(50-n);
	    }

	}
}
