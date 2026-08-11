# RESUFF15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-11T14:04:46.326Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        boolean bookingStatus = sc.nextBoolean();
        String roomType = sc.next();

        // Outer if condition checks if the booking is valid
        if (bookingStatus == true) {
            // Nested if condition checks the type of room
            if (roomType.equals("Luxury")) {
                System.out.println("Welcome to your Luxury Suite!");
            } else {
                System.out.println("Welcome to your Standard Room!");
            }
        } else {
            System.out.println("Booking not found. Please check your details.");
        }

        // Indicating that the reservation check is completed
        System.out.println("Reservation check completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF15)