/* 
 n=4

 1
 0 1
 1 0 1
 0 1 0 1

 */
import java.util.*;
class Zero_One_pattern 
{
    public static void main(String[] args)throws Exception {
      int i,j,n,m=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height of pyramid:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                
                System.out.print(m%2+" ");
                m++;
            }
            System.out.println();
        }
    }
}
