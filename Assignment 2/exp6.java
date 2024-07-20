class exp6test {
    int x = 11, y = 20;
    float z;

    void add() {
        z = x + y;
        display(z);
    }

    void sub() {
        z = x - y;
        display(z);
    }

    void mult() {
        z = x * y;
        display(z);
    }

    void div() {
        z = x / y;
        display(z);
    }

    void display(float ans) {
        System.out.println(ans);

    }
}

public class exp6 {
    public static void main(String[] args) {
        exp6test obj = new exp6test();
        obj.add();
        obj.sub();
        obj.mult();
        obj.div();
    }
}