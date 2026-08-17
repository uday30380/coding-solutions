import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		
		int first=scanner.nextInt();
		int middle = scanner.nextInt();
		int last = scanner.nextInt();
		
		
		int sum=first*middle;
		
		if(sum>last){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}

	}
}
