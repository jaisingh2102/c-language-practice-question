import java.util.*;
public class function3_evenOdd
{
    public static void even_odd(int a)
    {
return ;
    }
    public static void main(String[] args)
    {
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int p = sc.nextInt();
if(p%2==0)
    {
System.out.println("even  number");
    }
    else
        System.out.println("odd  number");
    even_odd(p);
sc.close();
    }
}