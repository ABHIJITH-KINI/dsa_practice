class LinkedList4 {
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

    void rotate(int k){
        Node temp = head;
        for (int i = 0; i<k ;i++){
            add(temp.data);
            temp = temp.next;
        }

        head = temp;
    }


}

public class LinkedListRotate {

    public static void main (String [] args){
        LinkedList4 ll = new LinkedList4();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        ll.print(ll.head);

        System.out.println("Rotate Linked List");

        ll.rotate(2);
        ll.print(ll.head);
    }
}
