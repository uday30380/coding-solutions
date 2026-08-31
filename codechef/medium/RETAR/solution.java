import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int z = scanner.nextInt();
		int u = scanner.nextInt();
		
		int final1 = scanner.nextInt();
		
		int total=x*y;
		int total1=z*u;
		
		int result=total1+total;
		
		if(result>=final1){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}

	}
}
