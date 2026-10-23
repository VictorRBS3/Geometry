public class MainPolygon {
    public static void main(String[] args) {
        Point[] points = {new Point(2, 2), new Point(4, 2), new Point(4, 4), new Point(2, 4)};

        Polygon p = new Polygon(points);
        System.out.println(p);
        System.out.println(p.getLength());
        p.setOffset(5, 5);
        System.out.println();
    }
}
