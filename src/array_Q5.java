public class array_Q5 {
    public static void main(String [] args)
    {
        int [][] arr = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int i,j;
        int c=0;
        for(i=0; i<arr.length ;i++)
        {
            for(j=0;j<arr.length;j++)
            {
                if(arr[i][j]==0)
                {
                    break;
                }
                System.out.println(arr[i][j]=0 );
                System.out.println(arr[j][i]=0 );
            }
            System.out.println();
        }
    }
}
