# ZCUWOB10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Odd Numbers in Range

Write a program to compute the sum of all odd numbers within a given range using a  **for loop with range and conditional statements**.

 **Steps to Complete:** 

- Prompt the user to enter the start and end values.
- Use a for loop to iterate through the range.
- Check if the current number is odd (number % 2 != 0) and add it to sum.
- Print the total sum after the loop ends.
### Sample 1:
Input
Output

```
1
10
```

```
Sum of odd numbers: 25 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T14:00:59.099Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        
        int start = scanner.nextInt(); // Read start value
        int end = scanner.nextInt(); // Read end value
        
        // Variable to store sum of odd numbers
        
        int number,sum=0;
        
        
        // Loop from start to end
        
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                sum+=i;
                
            }
            
        }





        
        // Print the total sum of odd numbers
        System.out.println("Sum of odd numbers: " + sum);
        
        scanner.close(); // Close the scanner
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB10)