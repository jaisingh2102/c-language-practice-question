import java.util.*;
public class function4_perfectSqure {
    public static void squre(int a)
    {
        return ;
    }
 public static void main(String[] args)
 {
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int s = sc.nextInt();
if(s== (int)Math.pow(2,s))
{
    System.out.println("perfect squre");
}
else
    {
   System.out.println("not aperfect squre");
}
squre(s);
sc.close();
 }   
}
