/*
    height=5


    * * * * *
      * * * *
        * * *
          * *
            *

 */

 import java.util.*;
public class Reverse_left_half_pyramid 
{
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the height:");
        n=sc.nextInt();
       
        for(i=n;i>=1;i--)
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
}
}
