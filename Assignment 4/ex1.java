import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        double a = sc.nextDouble();
        System.out.println("Enter Second number");
        double b = sc.nextDouble();
        double avg;
        avg = (a + b) / 2;
        System.out.println("Average = " + avg);
    }
}
