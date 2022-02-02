public class largest {
    public static  void main(String args[])
    {
        int a[] = {10,20,13,15,18,91};
        int max1,pos=0,i;
        max1 = a[0];
        for(i=1; i<6; i++)
        {
            if(a[i]>max1)
            {
             pos = i;
            }
        }
        max1=a[0];
        for(i=1; i<6; i++)
        {
            if(a[i]>max1 && a[i]<a[pos])
            {
                max1=a[i];
            }
        }
        System.out.println(max1);
    }
}
