# ZWFPSZ28

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Case Conversion

In this example, we demonstrate how to  **format user input**  by converting it to  **lowercase**  and  **uppercase**  using Java’s `toLowerCase()` and `toUpperCase()` methods.

- The toLowerCase() method converts all characters in the string to lowercase.
- The toUpperCase() method converts all characters in the string to uppercase.
### Sample 1:
Input
Output

```
Java Programming
```

```
Lowercase: java programming  
Uppercase: JAVA PROGRAMMING

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-10T16:55:16.360Z  

```java
import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        String userInput = scanner.nextLine();
        System.out.println("Lowercase: " + userInput.toLowerCase()); 

        System.out.println("Uppercase: " + userInput.toUpperCase());
     
        scanner.close(); 
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ28)