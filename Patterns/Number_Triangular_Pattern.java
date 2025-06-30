/*
size =4
        1
       2 2
      3 3 3
     4 4 4 4 

 */
import java.util.*;


 class Triangular_pattern
 {
    public static void main(String[] args)throws Exception {
        int i,j,n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        n=sc.nextInt();
        m=n;
        for(i=1;i<=n;i++)
        {
            for(j=m;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i+"  ");
            }
            m--;
            System.out.println();
        }
    }
 }