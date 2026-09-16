import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if ((A + B) % 2 == 0) {
            int give = (A - B) / 2;
            System.out.println(give);
        } else {
            System.out.println(-1);
        }
    }
}