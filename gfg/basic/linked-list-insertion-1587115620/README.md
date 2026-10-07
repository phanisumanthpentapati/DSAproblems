# Linked List End Insertion

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given the  **head** of a Singly Linked List and a value  **x**, insert that value  **x** at the end of the LinkedList and return the  **head** of the modified Linked List.

 **Examples :** 

```
Input: x = 6,
   
Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6
Explanation: We can see that 6 is inserted at the end of the linkedlist.
   

```

```
Input: x = 1,
   
Output: 4 -> 5 -> 1
Explanation: We can see that 1 is inserted at the end of the linked list.
      

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T14:08:10.233Z  

```java
/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode=new Node(x);
        
        if(head == null)
           return newNode;
           
           Node current = head;
           
        while(current.next != null)
        {
            current=current.next;
        }
        current.next=newNode;
        return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1)