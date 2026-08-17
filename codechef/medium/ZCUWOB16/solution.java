import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();

        
       if (start >= end) {
            System.out.println("Invalid Input");
            
        }
        else{
            
            System.out.println("Generated sequence:");
            for (int i = start; i < end; i += step) {
                System.out.print(i + " ");
            }
    
            System.out.println("\nSequence generation complete!");

        }

        scanner.close();
    }
}
