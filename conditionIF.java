//even or odd using if statement only
import java.util.Scanner;
public class conditionIF {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
int number = input.nextInt();
if(number%2 == 0)
{
    System.out.println("it's a even number");
}
if(number%2 != 0)
{
    System.out.println("it's a odd number");
}
input.close();
    }
}
