import java.util.Scanner;
public class forloop {
    public static void main(String[] args)
    {
System.out.println("enter a number");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i;
for(i=0; i<=n; i++)
{
  System.out.println("the value of i is = "+i);  
}
sc.close();
    }
    
}
