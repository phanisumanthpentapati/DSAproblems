# LJAAS40

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print the length

Write a program to print the length of each word of the sentence given below as well as the length of the whole sentence.

 **Note**  - Make sure to give a space after every word or "-" when printing

### Sample 1:
Input
Output

```

```

```
Coding - 6  
on - 2  
CodeChef - 8  
Coding on CodeChef - 18  
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T12:20:26.451Z  

```java
class Codechef
{
    public static void main (String[] args) 
    {
        String one = "Coding";
        String two = "on";
        String three = "CodeChef";
        String four = one + " " + two + " " + three;
        
        System.out.println(one + " - " + one.length());
        System.out.println(two + " - " + two.length()); // Added space before the hyphen
        System.out.println(three + " - " + three.length());
        System.out.println(four + " - " + four.length());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS40)