import java.util.*;
public class function_MyName {
    public static void MyName(String name)
    {
        System.out.println(name);
        return ;
    }
    public static void main(String[] args)
    {
     Scanner sc = new   Scanner(System.in);
     String name = sc.next();
     MyName(name);
     sc.close();
    }
}
