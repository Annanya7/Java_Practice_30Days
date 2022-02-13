package link;
import java.util.*;
public class Node1 {
    int data;
    Node1 link;
static int count=0;
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
            count++;
        }
        else
        {
            new1.link = n1;
            n1 = new1;
            count++;
        }
        return n1;
    }
    static Node1 insert_end(Node1 n1 , int elem)
    {
        Node1 save = n1;
        Node1 new2 = new Node1(elem);
        new2.link = null;
        while(save.link != null)
        {
            save= save.link;
        }
        save.link=new2;
        count++;
        return n1;
    }

    static void disp(Node1 n1) {
        // create a new node for displaying the objects
        Node1 list = n1;
        while (list != null) {
            System.out.println(list.data);
            list = list.link;
        }
        System.out.println("no of nodes = "+count);
    }


    public static void main(String[] args) {
        Node1 start = null;
        start=insert(start,89);
        start=insert_end(start,30);
        disp(start);

    }
}
// insertion in sorted list find location only element given.