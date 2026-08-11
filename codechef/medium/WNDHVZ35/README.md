# WNDHVZ35

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Senior Citizen Discount Check

Write a program to determine if a person qualifies for a senior citizen movie ticket discount based on age.

- If age >= 60, they get a senior discount.
- Otherwise, they pay the full price, and the program calculates how many years remain until they qualify.

 **Input:** 
A single integer representing the person's age.

### Sample 1:
Input
Output

```
65

```

```
You are eligible for a senior citizen discount!
Enjoy your discounted movie ticket.

```

### Sample 2:
Input
Output

```
50

```

```
You are not eligible for a senior citizen discount.
You need to wait 10 more years to qualify.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-11T03:03:24.637Z  

```java
import java.util.*;
// This class demonstrates the use of statements and semicolons in Java.
class Codechef {

    // The main method serves as the entry point for the program.
    public static void main(String[] args) {
        
        // write your code here
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        if(n>=60){
            System.out.println("You are eligible for a senior citizen discount!");
             System.out.println("Enjoy your discounted movie ticket.");
        }else{
            System.out.println("You are not eligible for a senior citizen discount.");
            System.out.println("You need to wait 10 more years to qualify.");
        }
        
       
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ35)