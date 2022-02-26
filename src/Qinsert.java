import pack1.stack1;

import java.util.Scanner;

public class Qinsert
{
    int front;
    int rear;
    int queue[] = new int[30];
    int max;
    Qinsert()
    {
        front =-1;
        rear=-1;
        max=30;
    }
    void insert(int item)
    {
        if(rear == max)
        {
            System.out.println("Overflow");
        }
        else
        {
            if(front == -1)
            {
                rear+=1;
                front+=1;
            }
            else
            {
                rear+=1;

            }
            queue[rear]=item;
        }


    }
    void delete()
    {
        if(front==-1)
        {
            System.out.println("Underflow");
        }
    else if(front == rear)
        {
            int item = queue[front];
            front =-1;
            rear=-1;
        }
    else
        {
            front+=1;
        }

    }
    void display()
    {
        for(int i=front; i<=rear;i++)
        {
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        Qinsert obj1 = new Qinsert();
        int ch;
        char choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("press 1 : for insertion");
            System.out.println("press 2 : for display");
            System.out.println("press 3 : for deletion");
            System.out.println("enter choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    int ele;
                    System.out.println("enter element");
                    ele = sc.nextInt();
                    obj1.insert(ele);
                    break;
                case 2:
                    obj1.display();
                    break;
                case 3:
                    obj1.delete();
                    break;
                default:
                    System.out.println("wrong choice");
            }
            System.out.println("do you want to continue press y/Y");
            choice = sc.next().charAt(0);
        }
        while (choice=='y'|| choice=='Y');

    }
}

