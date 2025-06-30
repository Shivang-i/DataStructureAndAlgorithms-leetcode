/* 
    n=5


    *
    * *
    * * * 
    * * * *
    * * * * *

 */

import java.util.*;
public class Right_half_pyramid 
{
   public static void main(String[] args) {
    int i,j,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the height of pyramid:");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
   } 
}
