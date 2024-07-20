package Task;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number to check prime or not");
        int a = sc.nextInt();
        System.out.println("Enter Number " + a + " is " + check(a));
    }

    private static Boolean check(int a) {
        if (a == 2)
            return true;
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}
