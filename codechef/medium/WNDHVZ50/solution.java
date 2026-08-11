import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for delivery conditions
        
        boolean correct = scanner.nextBoolean();
        int n = scanner.nextInt();
        
        if(correct == true||n<=24)
        {
            System.out.println("Package qualifies for same-day delivery.");
        }else{
            System.out.println("Package does not qualify for same-day delivery.");
        }



        // Checking eligibility for same-day delivery





    }
}
