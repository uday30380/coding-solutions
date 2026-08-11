import java.util.*;

class Codechef {
    public static void main(String[] args) {
        
        //Take user input
        
        Scanner scanner = new Scanner(System.in);
        
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Checking if the student meets the scholarship criteria
        if (first >= second) {  // Fill in the blank
            System.out.println("Scholarship Granted!"); // Fill in the blank
        } else {
            System.out.println("Scholarship Denied!"); // Fill in the blank
        }

        // Indicating that the evaluation process is complete
        System.out.println("Evaluation completed.");
    }
}
