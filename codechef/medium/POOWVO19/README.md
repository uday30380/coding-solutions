# POOWVO19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:55:35.616Z  

```java
class Codechef {
    public static void main(String[] args) {
        int row = 1; // Initialize row counter

        // Outer loop: Iterates through 4 rows
        while (row <= 4) {  
            int column = 1; // Reset column for each row

            // Inner loop: Iterates through 4 columns
            while (column <= 4) {  
                System.out.print("(" + row + "," + column + ") "); // Print cell coordinates
                column++; // Increment column
            }

            System.out.println(); // Move to the next line after completing a row
            row++; // Increment row counter
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO19)