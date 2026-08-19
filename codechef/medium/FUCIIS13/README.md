# FUCIIS13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Generate Multiplication Table

In this example, we demonstrate how  **for loops**  can be used to generate a multiplication table for any given number. The program takes an integer input from the user and prints its multiplication table from `1` to `10`.

When executed, the code will display the multiplication table in a structured format, showcasing how loops and arithmetic operations work together in Java.

### Sample 1:
Input
Output

```
5
```

```
Multiplication Table for 5:  
5 x 1 = 5  
5 x 2 = 10  
5 x 3 = 15  
5 x 4 = 20  
5 x 5 = 25  
5 x 6 = 30  
5 x 7 = 35  
5 x 8 = 40  
5 x 9 = 45  
5 x 10 = 50  
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T18:02:17.045Z  

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

[View on CodeChef](https://www.codechef.com/problems/FUCIIS13)