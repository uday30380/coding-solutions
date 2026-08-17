import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;
        int minSpeed = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
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