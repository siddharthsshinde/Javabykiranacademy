public class HW4 {
    public static void main(String[] args) {
        int[] marks = { 81, 54, 80, 76, 98 }; // Example marks in 5 subjects
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
            return "First class";
        } else if (percentage >= 50) {
            return "Second class";
        } else if (percentage >= 40) {
            return "Third class";
        } else {
            return "Fail";
        }
    }
}
