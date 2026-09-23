import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		String sds =  sc.next();
		
		if(sds.charAt(0)==sds.charAt(2)&&sds.charAt(1)==sds.charAt(3))
		{
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}

	}
}
