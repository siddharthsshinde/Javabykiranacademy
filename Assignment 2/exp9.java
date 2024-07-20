class RectangleArea {
    int length;
    int breadth;

    void Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getArea() {
        return length * breadth;
    }
}

public class exp9 {
    public static void main(String[] args) {
        RectangleArea r = new RectangleArea();
        r.Rectangle(2, 3);
        System.out.println(r.getArea());
    }
}