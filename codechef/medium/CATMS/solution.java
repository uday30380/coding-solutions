import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int minSpeed = sc.nextInt();
        int count = 1;

        for (int i = 1; i < N; i++) {
            int speed = sc.nextInt();

            if (speed < minSpeed) {
                count++;
                minSpeed = speed;
            }
        }

        System.out.println(count);

        sc.close();
    }
}