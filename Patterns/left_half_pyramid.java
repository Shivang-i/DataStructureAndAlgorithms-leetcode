/*
  n=5

            *
          * *
        * * *
      * * * *
    * * * * *



 */

 import java.util.*;
public class left_half_pyramid 
{
    public static void main(String[] args)throws Exception {
        int i,j,n,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n-i;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();

    }
}
