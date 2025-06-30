
/*
 *           *
 *         *   *
 *       *   *   *
 *     *   *   *   *
 *       *   *   *
 *         *   *      
 *           *

 * 
 */



import java.util.Scanner;
public class Diamond_pattern {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size:");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            
            }
            for(j=1;j<=i*2-1;j++){
              System.out.print("* ");

            }
            System.out.println();

        }
        for(i=n-1;i>0;i--)
        {
             for(j=1;j<=n-i;j++){
              System.out.print("  ");
            }
            
            for(j=1;j<=i*2-1;j++){
              System.out.print("* ");

            }
            System.out.println();
        }
        sc.close();

    }
    
}
