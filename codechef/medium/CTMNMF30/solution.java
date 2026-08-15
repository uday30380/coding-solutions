import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int i = 1;
        
        while (i <= n) {
            // Check if i is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
        
        scanner.close();
    }
}