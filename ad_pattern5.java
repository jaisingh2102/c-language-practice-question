import java.util.*;
public class ad_pattern5
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int k = 1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
        

            
                for(int j=2;j<=i;j++)
                {
                System.out.print(j+" ");

                }
                System.out.println();
    }
            sc.close();
        }
    }

