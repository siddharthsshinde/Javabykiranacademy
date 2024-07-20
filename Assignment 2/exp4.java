public class exp4 {
    boolean a = false;

    void check() {
        if (a == false) {
            a = true;
            System.out.println("The Boolean Value is : " + a);
        }
    }

    public static void main(String args[]) {
        exp4 obj = new exp4();
        obj.check();

        System.out.println(obj.a);
    }
}
