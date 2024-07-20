import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Char");
        String a = sc.next();
        System.out.println("Enter Scecond Char");
        String b = sc.next();
        int sum = (int) a.charAt(0) + (int) b.charAt(0);
        System.out.println(sum);
    }
}
