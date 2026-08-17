# ZCUWOB05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print multiples of a number in a range

Write a program that iterates through a range of numbers and  **prints the multiples of a user-defined number**.

 **Steps to Complete:** 

- Use a for loop to iterate from 1 to 10
- Inside the loop, use an if condition to check if the number is a multiple of a given number.
- If the condition is met, print the number.
### Sample 1:
Input
Output

```
3
```

```
3  
6  
9
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T13:53:46.169Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Read the user-defined number
        int multipleOf = sc.nextInt();
         
        // For loop to iterate through the range from 1 to 10
        for (int i = 1; i <= 10; i++) { 
            
            // Check if i is a multiple of the given number
            if (i % multipleOf == 0) { 
                System.out.println(i); // Print the multiple
            }
        }
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB05)