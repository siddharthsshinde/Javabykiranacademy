package Task;

import java.util.Scanner;

public class TriangularSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in the triangular series: ");
        int terms = sc.nextInt();

        System.out.println("Triangular Series:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(triangularNumber(i) + " ");
        }
    }

    public static int triangularNumber(int n) {
        return (n * (n + 1)) / 2;
    }
}
