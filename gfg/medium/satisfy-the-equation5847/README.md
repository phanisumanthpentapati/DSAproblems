# satisfy-the-equation5847

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T10:44:43.946Z  

```java
class Solution {
    public ArrayList<Integer> findPairs(int[] arr) {
        // code here
        HashMap<Integer, ArrayList<int[]>> map = new HashMap<>();
             for (int i = 0; i<arr.length; i++) {
                 for (int j = i + 1; j<arr.length; j++) {

                     int sum = arr[i]+arr[j];
                     map.putIfAbsent(sum, new ArrayList<>());
                     map.get(sum).add(new int [] {i, j});
                 }
             }

             for (int i = 0; i<arr.length; i++) {
                 for (int j = i + 1; j<arr.length; j++) {

                     int sum = arr[i]+arr[j];

                     if (map.containsKey(sum)) {

                         for (int[] pair : map.get(sum)) {
                             int a = pair[0];
                             int b = pair [1];

                             if (a != i && a != j &&
                             b != i && b != j &&
                             (i < a)) {

                                 return new ArrayList<>(Arrays.asList(i, j, a, b));
                             }

                         }
                     }
                 }
             }

             return new ArrayList<>(Arrays.asList(-1, -1, -1, -1));
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/satisfy-the-equation5847/1)