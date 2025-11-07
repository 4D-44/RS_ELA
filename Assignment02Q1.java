public class Assignment02Q1 {
    public static void main(String[] args) {
        Node list = new Node(1);
        System.out.println(list);
        list.addLast(5);
        list.addLast(10);
        list.addLast(15);
        list.addLast(155);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.addLast(20);
        list.addLast(35);
        list.addLast(25);
        list.addLast(30);
        System.out.println(list);
        list.reverse();
        System.out.println(list);
        list.removeFromEnd(4);
        System.out.println(list);
    }
}

class Node {
    int data;
    Node next = null, prev = null;
    Node head, tail = null;
    String errOne = "Unable to comply; only one element present";
    public Node(int thing) {
        data = thing;
        head = tail = this;
    }

    public void addLast(int thing) {
        Node arata = new Node(thing);
        Node kore = this; // temp node used to traverse the list
        while (kore != null) {
            if (kore.next == null) {
                kore.next = arata;
                arata.prev = kore;
                tail = arata;
                System.out.println("New tail: " + thing); // debugging
                break;
            }
            kore = kore.next;
        }
    }
    public void removeLast() {
        Node kore = this;
        while (kore != null) {
            if (kore.next != null) {
                if (kore.next.next == null) {
                    System.out.println("Removing tail: " + tail.data);
                    kore.next.prev = null; // unnecessary but lol
                    kore.next = null;
                    tail = kore;
                    break;
                }
            } else { // handling edge case...?
                System.out.println(errOne);
                break;
            }
            kore = kore.next;
        }
    }
    public void removeFirst() {
        Node kore = this;
        if (kore.next == null) // one element
            System.out.println(errOne);
        else {
            System.out.println("Removing head: " + this.data);
            this.data = this.next.data;
            this.next = this.next.next;
            this.next.prev = this;
        }
    }
    public void reverse() {
        Node kore = this;
        Node temp;
        while (kore != null) {
            if (kore.prev == null) 
                tail = kore;
            else if (kore.next == null) 
                head = kore;
            temp = kore.next;
            kore.next = kore.prev;
            kore.prev = temp;
            kore = kore.prev;
        }
        
        System.out.printf("New head: %d, new tail: %d\n",
        head.data, tail.data);
    }
    public void removeFromEnd(int idx) {
        Node target = tail;
        for (int i = 0; i < idx; i++) {
            target = target.prev;
        }
        if (target == head)
            removeFirst();
        else if (target == tail)
            removeLast();
        else {
            System.out.println("Removing: " + target.data);
            target.prev.next = target.next;
            target.next.prev = target.prev;
        }
    }

    @Override
    public String toString() {
        String res = "";
        Node kore = head;
        while (kore != null) {
            res += kore.next != null ? kore.data + "->" : kore.data;
            kore = kore.next;
        }

        return res;
    }
}