# Search in Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given the  **head**  of a singly linked list and an integer  **key**, check if the key is present in the linked list or not.

 **Example:** 

```
Input: key = 3,
      
Output: true 
Explanation: 3 is present in Linked List.
```

```
Input: key = 4,
   
Output: false
Explanation: 4 is not present in Linked List.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T14:21:32.086Z  

```java
class Solution {
    public boolean searchKey(Node head, int key) {

        Node current = head;

        while (current != null) {

            if (current.data == key) {
                return true;
            }

            current = current.next;
        }

        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1)