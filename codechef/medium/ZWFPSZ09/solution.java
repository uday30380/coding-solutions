import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Collect the temperature as a float
        
        float fff = scanner.nextFloat();


        // Collect the humidity percentage as a double
        
        
        double ddd = scanner.nextDouble();


        // Collect the rain prediction as a boolean
        
        boolean bbb = scanner.nextBoolean();


        // Display the collected weather details
        System.out.println("Weather Information:");
        System.out.println("Temperature: " + fff + "°C");
        System.out.println("Humidity: " + ddd + "%");
        System.out.println("Rain Expected: " + bbb);

        // Close the Scanner object
        scanner.close();
    }
}
