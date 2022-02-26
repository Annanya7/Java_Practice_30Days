package pack1;
import java.util.*;
public class stack1
{
    int top;
    int arr[] = new int[30];
    int max;
    stack1()
    {
        top = -1;
        max =5;
    }
    void insert(int item)
  {
      if(top>=max)
      {
          System.out.println("overflow");
      }
      else
      {
          top = top+1;
          arr[top]=item;
      }
  }
  void delete()
  {
      if(top==-1)
      {
          System.out.println("Underflow");
      }
      else
      {
          top=top-1;
      }
  }
  void display()
  {
      for(int i=top; i>=0; i--)
      {
          System.out.println(arr[i]);
      }
  }

    public static void main(String[] args) {
        stack1 obj1 = new stack1();
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




