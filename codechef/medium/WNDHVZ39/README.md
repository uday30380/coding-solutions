# WNDHVZ39

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fill in the Blanks - Check Temperature Safety

Complete the following Java program by filling in the missing part so that it correctly checks if a machine's temperature is within the safe operating range and prints `"Temperature is within the safe limit."` when the condition is met.

```
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        int machineTemperature = 75;
        int maxSafeTemperature = 80;

        if (_____) {  // Fill in the blank
            System.out.println("Temperature is within the safe limit.");
        }
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-11T03:06:23.994Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ39)