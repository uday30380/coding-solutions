import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Collect the traveler's name
        
        String nameofcar = scanner.nextLine();


        // Collect the number of travelers
        int nooftravllers = scanner.nextInt();


        // Collect the ticket price per traveler
        
        double ticketpriceper = scanner.nextDouble();


        // Collect the total luggage weight in kilograms
        
        double luggageWeight = scanner.nextDouble();


        // Collect meal preference as a boolean (true/false)
        
        boolean meanlsincluded = scanner.nextBoolean();


        // Display the travel booking details
        System.out.println("Booking Information:");
        System.out.println("Name: " + nameofcar); // Display traveler's name
        System.out.println("Number of Travelers: " + nooftravllers); // Display the number of travelers
        System.out.println("Ticket Price per Traveler: $" + ticketpriceper); // Display ticket price per traveler
        System.out.println("Luggage Weight: " + luggageWeight + " kg"); // Display luggage weight
        System.out.println("Meals Included: " + meanlsincluded); // Display meal inclusion status

        // Close the Scanner object to release system resources
        scanner.close();
    }
}
