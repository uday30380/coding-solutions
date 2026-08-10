# ZWFPSZ05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Add Two Number

Write a program to read two integers from the user, add them, and display the result using the given Scanner class. The `nextInt()` method allows us to directly capture integer input and perform arithmetic operations.

 **Steps to Complete:** 

- Read two integers from the user using the Scanner class.
- Add the two integers directly and display the result.
- Ensure proper closing of the Scanner object.

Run the code and input different integer values to observe how the program calculates their sum!

### Sample 1:
Input
Output

```
10
20
```

```
The sum is: 30
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-10T16:34:49.838Z  

```java
// Importing the Scanner class from the java.util package
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the keyboard (System.in)
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int sum = a+b;
        
        System.out.println("The sum is: "+sum);

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ05)