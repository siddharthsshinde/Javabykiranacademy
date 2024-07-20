import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal");
        double principal = sc.nextDouble();
        System.out.println("Enter rate per year");
        double rate = sc.nextDouble();
        System.out.println("Enter time in year");
        double time = sc.nextDouble();
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("The simple interest is " + simpleInterest);
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
