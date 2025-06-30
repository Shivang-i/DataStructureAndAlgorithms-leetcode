/*
 size=4

 1 2 3 4
 1 2 3
 1 2
 1

 */

 import java.util.*;
 class reverse_pattern
 {
    public static void main(String[] args)throws Exception {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the heigth of number increasing reverse triangle");
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        { 
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
 }