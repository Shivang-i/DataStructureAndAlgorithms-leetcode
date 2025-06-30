/*   n=4


       *
         *
       *   *
         *   *
       *   *   
         *     
       *       
  
 */






import java.util.Scanner;

public class right_pascal_triangle {
    public static void main(String[] args) {
        
        int n,j ;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of column:");
        n=sc.nextInt();
        for( int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                for(j=1;j<=i;j++)
                {
                    if(j%2==0)
                    System.out.print("* ");
                    else
                     System.out.print("  ");
                }
                System.out.println();
            }
            else{
                for(j=1;j<=i;j++)
                {
                    if(j%2!=0)
                    System.out.print("* ");
                    else
                     System.out.print("  ");
                }
                System.out.println();
            }
        }

        for( int i=n-1;i>=1;i--)
        {
            if(i%2==0)
            {
                for(j=1;j<=i;j++)
                {
                    if(j%2==0)
                    System.out.print("* ");
                    else
                     System.out.print("  ");
                }
                System.out.println();
            }
            else{
                for(j=1;j<=i;j++)
                {
                    if(j%2!=0)
                    System.out.print("* ");
                    else
                     System.out.print("  ");
                }
                System.out.println();
            }
        }

        sc.close();



    }
   
        
    }



