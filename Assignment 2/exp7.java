public class exp7 {
    int add_int(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        exp7 addOperation = new exp7();
        int c = addOperation.add_int(20, 40);
        System.out.println(c);
    }
}
