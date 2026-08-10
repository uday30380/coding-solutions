# ZWFPSZ29

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### replace() Method

How does the `replace()` method help in formatting user input?

```
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        
        String formattedInput = userInput.replace("-", "_");
        
        System.out.println("Formatted Output: " + formattedInput);
        
        scanner.close();
    }
}

```

If the user enters:

```
Java-Programming

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-10T16:56:22.958Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ29)