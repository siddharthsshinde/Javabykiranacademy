import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = sc.nextDouble();
        double area = side * side;
        System.out.println("Area of Square is: " + area);
    }
}
