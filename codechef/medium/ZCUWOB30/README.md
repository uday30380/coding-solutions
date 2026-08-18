# ZCUWOB30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find first number divisible by 7 and 14

Write a Java program that takes  **user input**  for a start value, end value, and step size.
The program ensures that the start value is  **less than**  the end value and then finds the  **first number in the range that is divisible by both 7 and 14**  using a  **for loop with a break statement**.

### Sample 1:
Input
Output

```
1001
10000
3
```

```
1022
```

### Sample 2:
Input
Output

```
100
150
4
```

```
112
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T13:48:23.982Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();
        
        // Validate that start is less than end
        while (start >= end) {
            System.out.println("Invalid input! Start value must be less than end value.");
        }

        // Loop starting from start, incrementing by step each time
        
        for (int i=start;i<end;i+=step){
            if(i%7==0 && i%14==0){
                System.out.println(i);
                break;
            }
        }






    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB30)