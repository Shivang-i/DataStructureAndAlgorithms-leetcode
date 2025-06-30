/*
 * n=4
 * 
 *      * * * *
 *      * * *
 *      * *
 *      *
 *      * *
 *      * * *
 *      * * * *
 * 
 * 
 */



import java.util.*;
public class k_pattern {

    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=2;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
       
    }
}
