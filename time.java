// Write a program to enter an integer for seconds and convert it into minutes and seconds 
import java.util.Scanner;
public class time {
    public static void main(String[] args)
    {
Scanner input = new Scanner(System.in);
System.out.println("enter time in second");
int second = input.nextInt();
int minutes = second/60;
int remainingsecond = second%60;
System.out.println("the time in minut of second" +second+"is" +minutes+ "minut and  "+remainingsecond+"remaining second");
input.close();
    }
}
