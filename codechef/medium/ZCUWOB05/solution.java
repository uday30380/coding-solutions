import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Read the user-defined number
        int multipleOf = sc.nextInt();
         
        // For loop to iterate through the range from 1 to 10
        for (int i = 1; i <= 10; i++) { 
            
            // Check if i is a multiple of the given number
            if (i % multipleOf == 0) { 
                System.out.println(i); // Print the multiple
            }
        }
        sc.close();
    }
}