# ZCUWOB35

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Matrix with Skipped Diagonal Pairs

Write a Java program that takes  **user input**  for the matrix size `n` and generates a  **square matrix**  of size `n x n`, where:

- Each row and column represents numbers from 1 to n.
- Each cell in the matrix contains a number from 1 to n, except when the row index equals the column index.
- When the row and column indices are the same (i.e., diagonal elements), print a dash (-) instead of the number.
### Sample 1:
Input
Output

```
5
```

```
 -  2  3  4  5 
 1  -  3  4  5 
 1  2  -  4  5 
 1  2  3  -  5 
 1  2  3  4  - 
Matrix with non-equal pairs completed.
```

### Sample 2:
Input
Output

```
3
```

```
-  2  3 
1  -  3 
1  2  - 
Matrix with non-equal pairs completed.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T13:56:12.808Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {  
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {  
                // If row index is equal to column index, print "-"
                if (i == j) {
                    System.out.print(" - ");
                    continue; // Skip the remaining statements in this iteration
                }
                System.out.print(" " + (j) + " "); // Print column number
            }
            System.out.println(); // Move to the next line after each row
        }

        // Print completion message
        System.out.println("Matrix with non-equal pairs completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB35)