/*
size=4

 1
 2 3 
 4 5 6
 7 8 9 10 
 
 */

 import java.util.*;
 class changing_pyramid_pattern
 {
    public static void main(String[] args)throws Exception {
       int i,j,n,p=1;
       Scanner sc=new Scanner(System.in) ;
       System.out.println("Enter the height of the triangle");
       n=sc.nextInt();
       for(i=1;i<=n;i++)
       {
        for(j=1;j<=i;j++)
        {
            System.out.print(p+" ");
            p++;
        }
        System.out.println();
       }
    }
 }
 