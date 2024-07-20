import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + " Enter marks of student obtained in Subject1 out of 100");
            marks[i] = sc.nextInt();
        }
        String division = calculateDivision(marks);
        System.out.println("The student obtained " + division);
    }

    public static String calculateDivision(int[] marks) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double percentage = (double) totalMarks / marks.length;

        if (percentage >= 60) {
            return "First division";
        } else if (percentage >= 50) {
            return "Second division";
        } else if (percentage >= 40) {
            return "Third division";
        } else {
            return "Fail";
        }
    }
}
