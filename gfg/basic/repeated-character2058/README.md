# Repeated Character

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string consisting of lowercase english alphabets. Find the repeated character present  **first**  in the string.

 **NOTE - If there are no repeating characters return '#'.** 

 **Example 1:** 

```
Input:
S = "geeksforgeeks"
Output: g
Explanation: g, e, k and s are the repeating
characters. Out of these, g occurs first. 

```

 **Example 2:** 

```
Input: 
S = "abcde"
Output: -1
Explanation: No repeating character present. (You need to return '#')

```

 **Your Task:** 
You don't need to read input or print anything. Your task is to complete the function  **firstRep()** which takes the string S as input and returns the the first repeating character in the string.  **In case there's no repeating character present, return '#'.** 

 **Expected Time Complexity:** O(|S|).
 **Expected Auxiliary Space:** O(1).

 **Constraints:** 
1<=|S|<=105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T04:52:22.711Z  

```java
class Solution {
    char firstRep(String S) {

        int[] freq = new int[26];

        // Step 1: Count frequency of every character
        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i) - 'a';
            freq[index]++;
        }

        // Step 2: Find the first character whose frequency > 1
        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i) - 'a';

            if (freq[index] > 1) {
                return S.charAt(i);
            }
        }

        return '#';
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/repeated-character2058/1)