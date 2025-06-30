/*
  n=4

                   1
                 2 1 2
               3 2 1 2 3
             4 3 2 1 2 3 4

          
 */
import java.util.*;
class pallindrome_triangular
{
    public static void main(String[] args)throws Exception {
        int n,i,j;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the height:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n-i;j>=1;j--)
            {
            System.out.print("  ");
            }

            for(j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for(j=2;j<=i;j++)
            {
                System.out.print(j+" ");
            }
        System.out.println();
    }
        
    }
}