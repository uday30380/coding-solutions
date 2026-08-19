# FUCIIS20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T18:09:29.614Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to take user input
        
        // Prompting the user to enter the number of terms
        int n = scanner.nextInt();

        int sum = 0; // Initialize the sum to 0

        // Using a for loop to calculate the sum of squares
        for (int i=1; i<=n;i++) {  // Fill in the blanks
            sum += i*i; // Fill in the blank
        }

        // Printing the sum of squares
        System.out.println("The sum of the squares of the first " + n + " natural numbers is: " + sum);

        // Closing the Scanner object
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FUCIIS20)