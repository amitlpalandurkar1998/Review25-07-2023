package linkedlisttoarraylist;

import java.util.ArrayList;
import java.util.List;

public class Method {
    Node head;
    List<Integer> list = new ArrayList<>();

    void addElement(int num){
        Node newNode = new Node(num);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.print(".");
    }

    void convertToArrayList(){
        Node temp = head;
        while (temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
    }
    void displayArrayList(){
        System.out.println(list);
    }
}
