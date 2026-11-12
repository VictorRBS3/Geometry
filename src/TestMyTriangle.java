public class TestMyTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(new Point(2, 3), new Point(4, 4), new Point(5, 2));
        Triangle t2 = new Triangle(1,1, 3,1, 2,3);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t2.getPerimeter());
        t2.printType();

    }
}
