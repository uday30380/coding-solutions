import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for purchase amount
        
        int n = scanner.nextInt();


        // Checking discount eligibility
        
        if(n>=1000){
            System.out.println("Congratulations! You are eligible for a discount.");
        }else{
            System.out.println("No Discount");
        }



        scanner.close();
    }
}
