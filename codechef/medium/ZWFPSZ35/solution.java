import java.util.Scanner; // Import the Scanner class to read user input

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the Math score from the user
        
        int firstScore = scanner.nextInt();


        // Read the Science score from the user
        
        int secondScore = scanner.nextInt();


        // Read the English score from the user
        
        int thridScore = scanner.nextInt();


        // Calculate the total score by adding the individual scores
        
        int sum = firstScore+secondScore+thridScore;


        // Calculate the average score by dividing the total by the number of subjects using a 'Double'
        
        double avg = sum/2;
        


        // Print the total score
        System.out.println("Total Score: "+sum);


        // Print the average score
        
        System.out.println("Average Score: "+avg);


        // Close the Scanner to release system resources
        scanner.close();
    }
}
