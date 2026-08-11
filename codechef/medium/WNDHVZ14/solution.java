import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Declaring a variable to store the secret code
        int secretCode = 7890;
        
        Scanner sc = new Scanner(System.in);
        int enteredCode = sc.nextInt();
        
        // Checking if the enteredCode matches the predefined secretCode
        if (enteredCode == secretCode) {  
            System.out.println("Access Granted: Vault Unlocked."); 
        } else {
            System.out.println("Access Denied"); 
        }

        // Indicating that the verification process is complete
        System.out.println("Verification completed.");
    }
}