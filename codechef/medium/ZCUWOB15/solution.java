import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input for start, end, and step values
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();

        // Step 2: Validate that start is less than end
        if(start<end){
            System.out.println("Generated sequence:");
        }else{
            System.out.println("Invalid Input");
        }

            // Step 3: Use a for loop to print the sequence4
            for(int i=start;i<=end;i+=step){
                System.out.print(i+" ");
                
                
            }
            System.out.println("");
            System.out.println("Sequence generation complete!");

        scanner.close();
    }
}
