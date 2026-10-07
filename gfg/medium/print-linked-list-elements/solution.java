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