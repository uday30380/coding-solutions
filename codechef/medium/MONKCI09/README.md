# MONKCI09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Shopping list management

You are given a partially written Java program that manages a shopping list using an ArrayList.
Your task is to complete the code by following the instructions in the comments.

 **Expected Output:** 

```
Final shopping list: [Milk, Eggs, Apples, Chicken, Rice]

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T02:08:08.797Z  

```java
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        
        // Add items to the shopping list
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        shoppingList.add("Cheese");
        shoppingList.add("Apples");
        shoppingList.add("Chicken");
        shoppingList.add("Rice");
        
        // Your code here
        // 1. Remove item at index 3 ("Cheese")
        
        shoppingList.remove(3);
        
        // 2. Remove item "Bread" by object
        shoppingList.remove("Bread");
        
        
        // Print the final shopping list
        System.out.println("Final shopping list: " + shoppingList);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI09)