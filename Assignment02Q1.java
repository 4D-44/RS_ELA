public class Assignment02Q1 {
    public static void main(String[] args) {
        Node list = new Node(5);
        System.out.println(list);
        list.addLast(10);
        list.addLast(15);
        list.addLast(155);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}

class Node {
    int data;
    Node next = null;
    Node head = null, tail = null;
    String errOne = "Unable to comply; only one element present";
    public Node(int thing) {
        data = thing;
        head = tail = this;
    }

    public void addLast(int thing) {
        Node arata = new Node(thing);
        Node kore = this;
        while (kore != null) {
            if (kore.next == null) {
                kore.next = arata;
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
        }
    }

    @Override
    public String toString() {
        String res = "";
        Node kore = this;
        while (kore != null) {
            res += kore.next != null ? kore.data + "->" : kore.data;
            kore = kore.next;
        }

        return res;
    }
}