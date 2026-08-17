# ZCUWOB16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T14:11:35.290Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();

        
       if (start >= end) {
            System.out.println("Invalid Input");
            
        }
        else{
            
            System.out.println("Generated sequence:");
            for (int i = start; i < end; i += step) {
                System.out.print(i + " ");
            }
    
            System.out.println("\nSequence generation complete!");

        }

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB16)