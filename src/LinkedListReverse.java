class LinkedList3 {
    Node head = null;

    void add(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;

    }

    void print(Node node) {

        Node temp = node;
        System.out.print(temp.data + "->");
        while (temp.next != null) {
            temp = temp.next;
            System.out.print(temp.data + "->");
        }
    }

    Node  reverse(Node node){

        Node current = node;
        Node prev = null;
        Node next = null;

        while (current != null){

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}

public class LinkedListReverse {

    public static void main(String [] args){
        LinkedList3 ll = new LinkedList3();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        ll.print(ll.head);

        Node revHead = ll.reverse(ll.head);
        System.out.println();
        ll.print(revHead);
    }
}
