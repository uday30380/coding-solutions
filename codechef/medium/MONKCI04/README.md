# MONKCI04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Arrange Favorite Subjects

You are given an empty `ArrayList` of subjects. Your task is to insert subjects in a specific order using the `add(index, element)` method.

- Add "Math" at the end of the list.
- Add "English" at the end of the list.
- Add "Science" at index 1.
- Add "History" at index 2.
- Add "Art" at index 0.

After all insertions, print the final list using `System.out.println()`.

 **Expected Output:** 

```
[Art, Math, Science, History, English]

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T02:02:31.785Z  

```java
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();

        // Add "Math" at the end
        
        subjects.add("Art");


        // Add "English" at the end
        
        subjects.add("Math");


        // Add "Science" at index 1
        
        subjects.add("Science");


        // Add "History" at index 2
        subjects.add("History");


        // Add "Art" at index 0
        
        subjects.add("English");


        // Print the final list
        System.out.println(subjects);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI04)