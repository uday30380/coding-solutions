# ZWFPSZ11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-10T16:40:54.366Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // The value is expected to be of type double
        double Celsiuss = scanner.nextDouble();


        // Converting the Celsius temperature to Fahrenheit using the formula: (C * 9/5) + 32
        
        double fianlalook = (Celsiuss*9/5)+32;


        // Displaying the converted Fahrenheit temperature
        
        System.out.println("Temperature in Fahrenheit: "+fianlalook);


        // Closing the Scanner object to release system resources and prevent memory leaks

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ11)