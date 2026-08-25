# OELXEW10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** 10  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T09:50:42.065Z  

```10
class Codechef {
    public static void main(String[] args) {
        // Static Initialization: Expenses in specific categories
         // Rent, groceries, utilities, travel, others
          double[] expenses= {2000.5, 1500.75, 800.25, 1200.00, 500.00};

        System.out.println("Rent Expense: " + expenses[0]);
        System.out.println("Grocery Expense: " + expenses[1]);

        // Dynamic Initialization: Add expenses later
        double[] newExpenses = {100.00, 150.00, 75.50};

        System.out.println("Internet Bill: " + newExpenses[0]);
        System.out.println("Gym Membership: " + newExpenses[1]);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OELXEW10)