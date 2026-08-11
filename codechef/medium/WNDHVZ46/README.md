# WNDHVZ46

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-11T06:15:00.635Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        String storedPassword = "Secure123";
        int requiredClearance = 3;

        Scanner scanner = new Scanner(System.in);

        // Taking user input
        String enteredPassword = scanner.next();
        int clearanceLevel = scanner.nextInt();

        // Checking access conditions
        
        if(storedPassword==enteredPassword)
        {
            System.out.println("Access granted.");
        }else{
            System.out.println("Access denied.");
        }
        
        System.out.println("Security check completed.");
    
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ46)