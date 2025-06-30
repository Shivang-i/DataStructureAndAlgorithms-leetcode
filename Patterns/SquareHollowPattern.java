/*
 size=5
        * * * * *
        *       *
        *       *
        *       *
        * * * * *

 */

 import java.util.*;
 class Square_hollow_pattern
 {
       public static void main(String[] args)throws Exception {
          int i,j,n;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the size of square");    
          n=sc.nextInt();
          for(i=1;i<=n;i++)
          {
          System.out.print("* ");
          }
              System.out.println();
          for(i=1;i<=n-2;i++)
          {
          System.out.print("* ");
              for(j=1;j<=n-2;j++)
              {
              System.out.print("  ");
              }
          System.out.print("* ");
              System.out.println();
          }

          for(i=1;i<=n;i++)
          {
          System.out.print("* ");
          }
                  sc.close();

       }
 }