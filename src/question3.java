import java.util.Scanner;
public class question3 {
    double pi = 3.14;
    public static void area(double radius){
        double ar=3.14*radius*radius;
        System.out.println("Area of circle is " + ar);
    }
    public static void circumference(double radius){
        double cf=2*3.14*radius;
        System.out.println("Circumference of circle is " + cf);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("*******Menu*******");
        System.out.println("1. Area of Circle");
        System.out.println("2. Circumference of Circle");
        System.out.println("3. Exit");
        System.out.println("Enter your choice");
        int inp = scn.nextInt();
        System.out.println("Radius is ");
        double radius = scn.nextDouble();
        switch(inp){
            case 1: area(radius);
                break;
            case 2: circumference(radius);
                break;
            case 3: break;
        }
    }
}
