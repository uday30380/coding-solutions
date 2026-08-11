import java.util.*;
// This class demonstrates the use of statements and semicolons in Java.
class Codechef {

    // The main method serves as the entry point for the program.
    public static void main(String[] args) {
        
        // write your code here
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        if(n>=60){
            System.out.println("You are eligible for a senior citizen discount!");
             System.out.println("Enjoy your discounted movie ticket.");
        }else{
            System.out.println("You are not eligible for a senior citizen discount.");
            System.out.println("You need to wait 10 more years to qualify.");
        }
        
       
    }
}