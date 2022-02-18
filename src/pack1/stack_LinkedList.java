package pack1;

import link.Node1;
import link.node;

import java.util.Scanner;

public class stack_LinkedList
{
    int data;
    stack_LinkedList link;
    stack_LinkedList(int d)
    {
        data = d;
    }
    static stack_LinkedList insert(stack_LinkedList n1, int item)
    {
        stack_LinkedList new1 = new stack_LinkedList(item);
        new1.link=null;
        if(n1==null)
        {
            n1=new1;
        }
        else
        {
            new1.link=n1;
            n1 = new1;
        }
        return n1;
    }
    static stack_LinkedList delete(stack_LinkedList n1)
    {
if(n1==null)
{
    System.out.println("under flow");
}
else
{
    stack_LinkedList ptr = n1;
    n1=n1.link;
}
return n1;
    }
    static void disp(stack_LinkedList n1) {
        // create a new node for displaying the objects
        stack_LinkedList list = n1;
        while (list != null) {
            System.out.println(list.data);
            list = list.link;
        }

    }
    public static void main(String args[])
    {
        stack_LinkedList top = null;
        char ch;
        int item,choice1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("press 1 for inserting");
            System.out.println("press 2 for display");
            System.out.println("press 3 for deletion ");
            System.out.println("enter your choice");
            choice1 = sc.nextInt();
            switch(choice1) {
                case 1:

                    System.out.println("enter element");
                    item = sc.nextInt();
                    top = insert(top, item);
                    break;
                case 2:
                    disp(top);
                    break;
                case 3:
                    top = delete(top);
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
