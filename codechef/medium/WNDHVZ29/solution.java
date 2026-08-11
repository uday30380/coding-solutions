import java.util.*;
// This class demonstrates the use of statements and semicolons in Java.
class Codechef {

    // The main method serves as the entry point for the program.
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       
       int n = scanner.nextInt();
       
       if(n>60){
           System.out.println("You are eligible for the advanced course!");
       }else{
           System.out.println("You need to score higher to enroll in the advanced course.");
       }
    }
}