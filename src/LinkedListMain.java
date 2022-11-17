class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList1{

    Node head = null;

    void add(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;

    }

    void print(){
        Node temp = head;

        while(temp.next != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data + "->");

    }

    Node getMid(){

        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer.next != null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;

    }


}

public class LinkedListMain {

    public static void main (String [] args){

        LinkedList1 ll = new LinkedList1();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        ll.print();

        System.out.println("Mid of Linked List :"+ ll.getMid().data);
    }
}
