public class HW1 {

    public static void main(String[] args) {
        int number = 11;
        int cube = calculateCube(number);
        System.out.println("The cube of " + number + " is " + cube);
    }

    public static int calculateCube(int number) {
        return number * number * number;
    }
}