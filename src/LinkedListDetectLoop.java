//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}


import java.util.HashSet;

class LinkedList2{
     Node head = null;

    void add(int value){
        Node node = new Node(value);

        if(head==null){
            head = node;
            return;
        }

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = node;

    }

    void print(){

        Node temp = head;
        System.out.print(temp.data +"->");
        while(temp.next != null){
            temp = temp.next;
            System.out.print(temp.data +"->");
        }
    }

    void detectLoop1(){

        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer.next != null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer){
                System.out.println("Loop detected");
                break;
            }

        }

    }

    void detectLoop2(){
        HashSet<Node> s = new HashSet<>();

        Node temp = head;

        while (temp != null){
            if(s.contains(temp)){
                System.out.println("Loop detected");
                break;
            }
            s.add(temp);
            temp = temp.next;
        }
    }
}
public class LinkedListDetectLoop {

    public static void main(String [] args){
        LinkedList2 ll = new LinkedList2();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        ll.print();

        ll.head.next.next.next.next.next = ll.head;

        ll.detectLoop2();


    }

}
