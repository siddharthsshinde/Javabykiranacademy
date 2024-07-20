public class exp8 {
    double getArea(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        exp8 area = new exp8();
        double z = area.getArea(11.2, 20.1);
        System.out.println(z);
    }
}
