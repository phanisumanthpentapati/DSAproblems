# implement-stack-using-array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T05:49:32.492Z  

```java
class myStack {
    int[] arr;
        int top;
        int capacity;

    public myStack(int n) {
        // Define Data Structures
        arr=new int[n];
        capacity=n;
        top=-1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top == -1;
    }

    public boolean isFull() {
        // check if the stack is full
         return top == capacity - 1;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if (isFull()) {
                   return;
               }

               top++;
               arr[top] = x;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if (isEmpty()) {
                   return;
               }

               top--;
    }

    public int peek() {
        // Returns the top element of the stack
        if (isEmpty()) {
                  return -1;
              }

              return arr[top];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1)