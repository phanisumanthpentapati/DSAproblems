# identical-linked-lists

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T10:58:17.125Z  

```java
/* Structure of a Node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        // code here
        boolean b=true;

            while(head1!=null && head2!=null)
            {
                if(head1.data!=head2.data)
                {
                    return false;
                }
                head1=head1.next;
                head2=head2.next;
            }
            return (head1==null & head2==null);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/identical-linked-lists/1)