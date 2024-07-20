package Task;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number to check pallindrome or not");
        int a = sc.nextInt();
        System.out.println("Enter Number " + a + " is " + isPalindrome(a));

    }

    public static boolean isPalindrome(int number) {
        int n = number;
        int re = 0;

        while (number != 0) {
            int digit = number % 10;
            re = re * 10 + digit;
            number /= 10;
        }

        return n == re;
    }

}