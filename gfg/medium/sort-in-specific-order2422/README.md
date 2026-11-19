# sort-in-specific-order2422

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T16:21:57.754Z  

```java
class Solution {
    public void sortIt(int[] arr) {
        // code here
        ArrayList<Integer> odd = new ArrayList<>();
               ArrayList<Integer> even = new ArrayList<>();

               // Separate odd and even numbers
               for(int num : arr) {
                   if(num % 2 != 0) {
                       odd.add(num);
                   }
                   else {
                       even.add(num);
                   }
               }

               // Sort odd numbers in descending order
               Collections.sort(odd, Collections.reverseOrder());

               // Sort even numbers in ascending order
               Collections.sort(even);

               // Put odd numbers first
               int index = 0;

               for(int num : odd) {
                   arr[index++] = num;
               }

               // Put even numbers next
               for(int num : even) {
                   arr[index++] = num;
               }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-in-specific-order2422/1)