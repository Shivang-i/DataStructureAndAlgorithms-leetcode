/*
    n=5

    * * * * *
    * * * * 
    * * * 
    * *
    *

 */

import java.util.*;
public class Reverse_Right_half_pyramid
 {
    public static void main(String[] args)throws Exception {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height:");
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
