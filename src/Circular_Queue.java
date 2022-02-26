import java.util.Scanner;

public class Circular_Queue
{
    int front;
    int rear;
    int queue[] = new int[30];
    int max;
    int count;
    Circular_Queue()
    {
        front =-1;
        rear=-1;
        max=5;
        count=0;
    }
    void insert(int item) {
        if ((front == 0 && rear == max - 1) || front == rear + 1) {
            System.out.println("Overflow");
        }
        else {
            if (front == -1)
            {
                rear = 0;
                front = 0;
            }
            else if (rear == max-1)
            {
                rear = 0;

            }
            else {
                rear += 1;
            }
            queue[rear] = item;
count++;
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
            count--;
        }
        else if(front == max-1)
        {
            front=0;
            count--;
        }
        else
        {
            front+=1;
            count--;
        }

    }
    void display() {
        if (rear < front) {
            int i = front;
            while (i != rear + 1) {
                if (i > max-1) {
                    i = 0;

                }
                else {
                    System.out.println(queue[i]);
                    i++;
                }

            }
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
    public static void main(String[] args) {
        Circular_Queue obj1 = new Circular_Queue();
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
