package Task;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number to check Armstrong or not");
        int a = sc.nextInt();
        System.out.println("Enter Number " + a + " is " + isArmstrong(a));

    }

    public static boolean isArmstrong(int number) {
        int n = number;
        int result = 0;
        int nd = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, nd);
            number /= 10;
        }

        return n == result;
    }
}
