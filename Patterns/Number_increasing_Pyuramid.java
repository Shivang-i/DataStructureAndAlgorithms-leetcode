/*
size=4

 1
 1 2
 1 2 3
 1 2 3 4
 */

 import java.util.*;
 class pattern
 {
    public static void main(String[] args)throws Exception {
        int i,j,n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the height of the increasing triangle:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
               System.out.print(j+" "); 
            }
            System.out.println();
        }
    }
 }