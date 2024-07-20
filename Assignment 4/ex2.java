import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Charater for ASCII code");
            String chr = sc.next();
            int chri = chr.charAt(0);
            System.out.println("The ASCII value of " + chr + " is :" + chri);
        }
    }
}
