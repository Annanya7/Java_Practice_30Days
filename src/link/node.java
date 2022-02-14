package link;

import java.util.Scanner;

public class node {
    int data;
    node next;
    static  int count=0;
    node()
    {

    }
    node(int d)
    {
        data = d;
    }
    static node insert(node n1,int ele) {
        node new1 = new node(ele);
        new1.next = null;

   if (n1 == null) {
            n1 = new1;
            count++;
        } else {
            new1.next = n1;
            n1 = new1;
       count++;
        }
        return n1;

    }

    static node insert_loc(node n1,int ele,int ind) {
        node new1 = new node(ele);
        new1.next = null;
        int i=1;
        if(ind>count)
        {
            System.out.println("insertion at given location not possible");
        }
        else {
            node ptr = n1;
            while(i<ind)
            {
                ptr = ptr.next;
                i++;
            }
            new1.next = ptr.next;
            ptr.next = new1;
            count++;
        }
        return n1;

    }


    static node delete_loc(node n1,int ind) {
        if(ind>count)
        {
            System.out.println("deletion not possible");
        }
        else {
            int i = 1;

            node ptr = n1;
            node save = null;
            while (i < ind) {
                save = ptr;
                ptr = ptr.next;
            i++;
            }
            save.next = ptr.next;
        }
        return n1;

    }
static void dis(node n1)
        {
            node list = n1;
            while(list!=null)
            {
                System.out.println(list.data);
                list = list.next;
            }

        }

    public static void main(String args[])
    {
        node start = null;
        char ch;
        int item,choice1;
        Scanner sc = new Scanner(System.in);
       do {
           System.out.println("press 1 for inserting");
           System.out.println("press 2 for display");
           System.out.println("press 3 for insertion at given location");
           System.out.println("press 4 for deletion ");
           System.out.println("enter your choice");
           choice1 = sc.nextInt();
           switch(choice1) {
               case 1:

                   System.out.println("enter element");
                   item = sc.nextInt();
                   start = insert(start, item);
                   break;
               case 2:
                   dis(start);
                   break;
               case 3:
                   System.out.println("enter element");
                   item = sc.nextInt();
                   System.out.println("at position");
                   int pos = sc.nextInt();
                   start = insert_loc(start,item,pos);
                   break;
               case 4:
                   int loc;
                   System.out.println("enter location");
                   loc = sc.nextInt();
                   start = delete_loc(start,loc);
                   break;
               default:
                   System.out.println("enter valid choice");
           }
                   System.out.println("do you want to continue press y/Y");
           ch = sc.next().charAt(0);
       }
       while(ch=='y' || ch=='Y');

    }
}