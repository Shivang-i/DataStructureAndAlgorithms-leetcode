/*
 size=5
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *

 */


import java.util.*;
public class Square_fill_pattern 
{
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the edge:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
