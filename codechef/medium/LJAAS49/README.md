# LJAAS49

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Area of circle

Write a program that takes the radius of a circle as input and prints its area. (use $\pi$ = 3.14)

### Sample 1:
Input
Output

```
5
```

```
78.5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T12:31:08.503Z  

```java
import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        double radius = sc.nextDouble();
        double area=3.14*radius * radius;
        System.out.println(area);
        
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS49)