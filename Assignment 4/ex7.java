import java.util.Scanner;

public class ex7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
        double circumference = Math.PI * 2 * radius;
        System.out.println("The circumference of the circle is " + circumference);
    }
}
