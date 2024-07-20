public class exp1 {
    int a;
    float b;
    String str;

    public void operation1() {
        a = 11;
        b = 20.01f;
        str = "Java";
    }

    public void operation2() {
        a = 20;
        b = 24f;
        str = "SELENIUM";
    }

    public void display() {
        System.out.println("The Integer Value is :" + a);
        System.out.println("The Float Value is :" + b);
        System.out.println("The String Value is: " + str);
    }
}

class mainExercise1 {
    public static void main(String args[]) {
        exp1 obj = new exp1();
        obj.operation1();
        obj.display();
        obj.operation2();
        obj.display();
    }
}
