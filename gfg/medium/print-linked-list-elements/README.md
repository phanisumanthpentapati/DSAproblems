# print-linked-list-elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T14:18:39.133Z  

```java
/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        Node current=head;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(current!=null)
        {
            list.add(current.data);
            current=current.next;
        }
        return list;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-linked-list-elements/1)