package link;
import java.util.*;
public class Node1 {
    int data;
    Node1 link;

    Node1(int d) {
        data = d;
    }

    static Node1 insert(Node1 n1, int ele)// here n1 is start
    {
        // create a temporary node and put data in it and attch it to the start node
        Node1 new1 = new Node1(ele);
        new1.link = null;
        if (n1 == null) {
            n1 = new1;
        } else {
            new1.link = n1;
            n1 = new1;
        }
        return n1;
    }
    static Node1 delete(Node1 n11,Node1 n2)
    {
        Node1 save = n11; // start
        Node1 next = n2; // null
        Node1 en = null;
        while(next!= null)
        {
            next = next.link;
            save= save.link;
        }
        en = save;
        return en;
    }

    static void disp(Node1 n1) {
        // create a new node for displaying the objects
        Node1 list = n1;
        while (list != null) {
            System.out.println(list.data);
            list = list.link;
        }

    }


    public static void main(String[] args) {
        Node1 start = null;
        Node1 end = null;
        start=insert(start,89);
        end= delete(start,end);
        disp(start);

    }
// insertion at end code

}