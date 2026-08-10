import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        String userInput = scanner.nextLine();
        System.out.println("Lowercase: " + userInput.toLowerCase()); 

        System.out.println("Uppercase: " + userInput.toUpperCase());
     
        scanner.close(); 
    }
}
