import java.util.*;
public class sumof {
  public static void main(String[] args)
  {
    System.out.println("enter the limit");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sum = 0;
int i;
for(i = 1;i<=n;i++)
{
    sum = sum+i;
}
System.out.println(sum);
sc.close();
  }  
}
