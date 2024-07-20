import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int length = sc.nextInt();
        System.out.println("Enter width");
        int width = sc.nextInt();
        int perimeter;
        System.out.println("first no (length): " + length);
        System.out.println("second no (width): " + width);
        perimeter = 2 * (length + width);
        System.out.println("Perimeter of a rectangle is " + perimeter);
    }
}
