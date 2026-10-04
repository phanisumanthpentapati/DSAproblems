# Reverse Vowels

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string consisting of lowercase English alphabets, reverse only the vowels present in it and print the resulting string.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: "geeksforgeeks"
Explanation: The vowels are: e, e, o, e, e. Reverse of these is also e, e, o, e, e.

```

```
Input: s = "practice"
Output: "prectica"
Explanation: The vowels are a, i, e. Reverse of these is e, i, a.

```

```
Input: s = "bcdfg"
Output: "bcdfg"
Explanation: There are no vowels in s.
```

 **Constraints:** 
1<=|s|<=105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T11:29:08.550Z  

```java
class Solution {
    public String modify(String s) {
        // code here
        char[] arr = s.toCharArray();

                int left = 0;
                int right = arr.length - 1;
        while (left < right) {

                   // Find vowel from left
                   while (left < right && !isVowel(arr[left])) {
                       left++;
                   }

                   // Find vowel from right
                   while (left < right && !isVowel(arr[right])) {
                       right--;
                   }
        char temp = arr[left];
                   arr[left] = arr[right];
                   arr[right] = temp;

                   left++;
                   right--;
               }

               return new String(arr);
           }

           private boolean isVowel(char ch) {
               return ch == 'a' || ch == 'e' || ch == 'i'
                   || ch == 'o' || ch == 'u';
           }
    }

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reversing-the-vowels5304/1)