import java.util.ArrayList;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take the size of the list
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 2: Input words into the ArrayList
        
        ArrayList <String> shopping = new ArrayList<>();
        
        shopping.add("Rain");
        shopping.add("Tree");
        shopping.add("Cloud");
        shopping.add("Moon");
        
        




        // Step 3: Remove words with length < 4






        // Step 4: Print the updated list
        System.out.println(shopping);

        sc.close();
    }
}
