# MONKCI10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Removing unwanted words

You are given the task to build a program that takes a list of words from the user and removes all the words that are shorter than 4 characters.

 **Tasks:** 

- Take an integer input n representing the number of words to be entered.
- Take n words as input from the user and store them in an ArrayList.
- Remove all words that have a length less than 4.
- Print the final list after removal.

 **HINT:**  To find length of string use.length() method.

### Sample 1:
Input
Output

```
6
Sun
Rain
Tree
Sky
Cloud
Moon
```

```
[Rain, Tree, Cloud, Moon]

```

### Sample 2:
Input
Output

```
5  
Cat
Dog
Elephant 
Ant
Lion
```

```
[Elephant, Lion]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T02:17:45.957Z  

```java
import java.util.ArrayList;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take the size of the list
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 2: Input words into the ArrayList
        
        ArrayList <String> shopping = new ArrayList<>();

        // Step 3: Remove words with length < 4
        
        if(shopping.length()<4){
            
        }
        






        // Step 4: Print the updated list
        System.out.println(shopping);

        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI10)