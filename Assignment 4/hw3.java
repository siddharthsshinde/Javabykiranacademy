import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount ");
        double principal = sc.nextDouble();
        System.out.println("Enter annual interest rate ");
        double rate = sc.nextDouble();
        System.out.println(" number of times interest is compounded per year ");
        double n = sc.nextDouble();
        System.out.println("Enter number of years");
        double time = sc.nextDouble();
        double compoundInterest = calculateCompoundInterest(principal, rate, time, n);
        System.out.println("The compound interest is " + compoundInterest);
    }

    public static double calculateCompoundInterest(double principal, double rate, double time, double n) {
        return principal * Math.pow((1 + rate / (n * 100)), n * time) - principal;
    }
}
