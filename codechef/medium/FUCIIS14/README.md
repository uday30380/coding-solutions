# FUCIIS14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T18:02:18.615Z  

```java
import java.util.Scanner; // Import the Scanner class for user input

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in); 
        
        // Prompt the user to enter the number for which the multiplication table will be generated
        int number = scanner.nextInt(); 
        
        // Loop to generate the multiplication table from 1 to 10
        System.out.println("Multiplication Table for " + number + ":"); // Print a header
        for (int i = 1; i <= 10; i++) {
            // Print the current step of the multiplication in the format "number x i = result"
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        scanner.close(); // Close the Scanner object to release resources
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FUCIIS14)