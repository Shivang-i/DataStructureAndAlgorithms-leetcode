/*
 * n=4
 * 
 * 
 *    1
 *   1 1
 *  1 2 1
 * 1 3 3 1
 * 
 */




import java.util.*;

public class pascal_Triangle {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of triangle");
        n=sc.nextInt();
        int x=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=x;j>=1;j--)
            {
                System.out.print("  ");
            }
            int m=(int)Math.pow(11,(i-1));
            while(m!=0)
            {
                int a=m%10;
                System.out.print(a+"  ");
                m=m/10;
            }
            x--;
            System.out.println();
            
        }
        sc.close();
        
    }
}
