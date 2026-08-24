# JAVATC04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Watch before you write

In this practice problem, you will ask the user for an integer. However, the user may enter a float, a string, or something else—we don’t know.

What we do know is that we must handle both cases:

- When the user provides the expected integer input
- When they enter something unexpected

 **Write a Java program to take an integer input from the user and handle the case where the user enters invalid input (like a string or float).** 

### Input Format
- A single integer entered by the user.
### Output Format
- If input is an integer, print the integer.
- If input is invalid, print: Invalid Integer
### Sample 1:
Input
Output

```
42
```

```
42
```

### Sample 2:
Input
Output

```
JK
```

```
Invalid Integer
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T16:37:11.009Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		try{
		    int result=n;
		    System.out.println(result);
		}catch(NumberFormatException e){
		    System.out.println("Invalid Integer");
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JAVATC04)