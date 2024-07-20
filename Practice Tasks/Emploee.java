package Task;

import java.util.Scanner;

public class Emploee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter Department");
        String dept = sc.nextLine();

        System.out.println("Enter Salary");
        double salary = sc.nextDouble();

        System.out.println("Name = " + name + ", Department = " + dept + ", Salary = " + salary);

        sc.close();
    }
}