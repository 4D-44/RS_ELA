public class class2 {
    // Diff between primitive and non-primitive data types mainly depends on memory allocation, and primitive data types are often known as reference type data type.
    // Array can store all types of data, whereas ArrayList can only store non-primitive data types (no int, char, etc.; only Integer, Character, etc.)
    // linked lists are linear data structures like arraylists. They are also lists that are dynamic in size, but they store elements in nodes that are connected via pointers, rather than in contiguous memory locations like arraylists.
    // Linked lists allow for efficient insertions and deletions at any position in the list, whereas arraylists may require shifting elements to accommodate such operations.
    // However, linked lists have slower access times for elements at specific indices compared to arraylists, which provide constant-time access due to their contiguous memory allocation.

    //linked lists have 1. data 2. reference/pointer to next node and also sometimes 3. reference/pointer to previous node (doubly linked list)
    //Refer to class2.drawio for visual representation
    // Value in linked list = node, value in arraylist = element
    // Linked lists always have a head node (first node) [ArrayList[0]] and tail node (last node) [ArrayList.size()-1]
    // If we set the 2nd node to be the head node, the original head node will be lost and we will not be able to access it anymore.
    // Pros: We can access first and last elements instantly
    // Cons: We cannot access middle elements instantly, we have to traverse from head/tail to that element
    public static void main(String[] args) {
        Node list = new Node(10); // bhul hoise lol
        list.addFirst(50);
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        System.out.println(list);
        list.addMiddle(3, 100);
        list.addMiddle(0, 2);
        System.out.println(list);
        list.removeFirst();
        list.removeMiddle( 2);
        System.out.println(list);
    }
    // although we can make linked lists, they already exist under collection framework as LinkedList class in java.util package
}
class Node {
    int data;
    Node next, head, tail;
    public Node(int item) {
        this.data = item;
        this.next = null;
    }
    public void addFirst(int item) {
        Node thing = new Node(item);
        if (head == null) {
            head = tail = thing;
        } else {
            thing.next = head;
            head = thing;
        }
    }
    public void addMiddle(int idx, int item) {
        // temp = head, move temp to idx-1 position
        Node newNode = new Node(item);
        Node temp = head;
        
        if (idx != 0) {
            for (int i = 0; i < idx-1; i++) {
                temp = temp.next; // Traverse forward till just before target
            }
            newNode.next = temp.next; // Link new node to target node
            temp.next = newNode; // Link previous node to new node
        } else {
            addFirst(item);
        }
    }
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }
    public void removeMiddle(int idx) {
        Node temp = head;
        if (idx != 0) {
            for (int i = 0; i < idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next; // Bypasses target node
        }
    }
    @Override
    public String toString() {
        String res = "";
        Node curr = head;
        while (curr != null) {
            if (curr.next != null)
                res += curr.data + " -> ";
            else
                res += curr.data;
            curr = curr.next;
        }
        return res;
    }
}