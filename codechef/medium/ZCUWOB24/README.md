# ZCUWOB24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T14:16:55.630Z  

```java
class Codechef {
    public static void main(String[] args) {
        int size = 4; // Define table size (4x4)

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {
            
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {
                System.out.print((i * j) + "\t"); // Print product with tab space
            }
            
            System.out.println(); // Move to the next line after printing a row
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB24)