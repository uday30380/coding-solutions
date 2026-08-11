# WNDHVZ06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-11T02:21:18.829Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for purchase amount
        
        int n = scanner.nextInt();


        // Checking discount eligibility
        
        if(n>=1000){
            System.out.println("Congratulations! You are eligible for a discount.");
        }else{
            System.out.println("No Discount");
        }



        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ06)