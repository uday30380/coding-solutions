import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {  
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {  
                // If row index is equal to column index, print "-"
                if (i == j) {
                    System.out.print(" - ");
                    continue; // Skip the remaining statements in this iteration
                }
                System.out.print(" " + (j) + " "); // Print column number
            }
            System.out.println(); // Move to the next line after each row
        }

        // Print completion message
        System.out.println("Matrix with non-equal pairs completed.");
    }
}
