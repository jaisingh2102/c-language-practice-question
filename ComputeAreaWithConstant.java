import java.util.Scanner;
public class ComputeAreaWithConstant {
    public static void main(String[] args)
    {
        final double PI = 3.1415;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius");
        double radius = input.nextDouble();
        double area = (radius*radius*PI);
         System.out.println("THE AREA OF RADIUS "+radius+"is"+area);
         input.close();
    }
}
