package link;

public class circular_node
{
    int data;
    circular_node link;
    static int count=0;
    circular_node(int d)
    {
        int data =d;
    }
    static circular_node insertion(circular_node n1, int item)
    {
        circular_node new1 = new circular_node(item);//To add an element
        circular_node ptr = n1;// to traverse the elements
        if(n1 == null)
        {
            n1=new1;
            n1.link=n1;
            count++;
        }
        else
        {
            while(ptr.link != n1)// traversing till we come to n1 since its a circular list
            {
                ptr=ptr.link;
            }
            ptr.link=new1;
            new1.link=n1;
        }
        return n1;
    }
    static circular_node insert_beg(circular_node n1 , int item)
    {
        circular_node new2= new circular_node(item);
        circular_node ptr=n1;
        if(n1==null)
        {
            n1=new2;
            n1.link=n1;
        }
        else
        {
            while(ptr.link !=n1)
            {
                ptr.link=new2;
                new2.link=n1;
            }
            ptr.link=new2;
            n1=new2;
        }
        return n1;
    }

}
