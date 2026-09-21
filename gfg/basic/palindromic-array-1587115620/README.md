# Array with All Palindromes

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**  of positive integers. Return true if all the array elements are palindrome otherwise, return false.

 **Examples:** 

```
Input: arr[] = [111, 222, 333, 444, 555]
Output: true
Explanation:
arr[0] = 111, which is a palindrome number.
arr[1] = 222, which is a palindrome number.
arr[2] = 333, which is a palindrome number.
arr[3] = 444, which is a palindrome number.
arr[4] = 555, which is a palindrome number.
As all numbers are palindrome so This will return true.
```

```
Input: arr[] = [121, 131, 20]
Output: false
Explanation: 20 is not a palindrome hence the output is false.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T13:27:07.550Z  

```java
class Solution {
    public boolean isPalinArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int original = arr[i];
            int n = arr[i];
            int reverse = 0;

            // Reverse the number
            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n / 10;
            }

            // Check palindrome
            if (original != reverse) {
                return false;
            }
        }

        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1)