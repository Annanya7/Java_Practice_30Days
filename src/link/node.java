package link;

import java.util.Scanner;

public class node {
    int data;
    node next;
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
        } else {
            new1.next = n1;
            n1 = new1;

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
               default:
                   System.out.println("enter valid choice");
           }
                   System.out.println("do you want to continue press y/Y");
           ch = sc.next().charAt(0);
       }
       while(ch=='y' || ch=='Y');

    }
}