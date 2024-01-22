package addtwonumbers;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkList {
    Node head;
    Node tail;

    public DoublyLinkList(){
        head = null;
        tail = null;
    }

    public void traverseForward(){
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
    }

    public void traverseBackward(){
        Node current = head;
        while(current.prev != null){
            current = current.prev;
        }
    }

    public void insert(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    public void insert(int data, int position) {

    }


    public ArrayList<Integer> print() {
        ArrayList<Integer> print = new ArrayList();
        Node current = head;
        print.add(head.data);
        while (current.next != null){
            current = current.next;
            print.add(current.data);
    }
    return print;
}


}
