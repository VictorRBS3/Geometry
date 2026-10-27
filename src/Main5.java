public class Main5 {
    public static void main(String[] args) {
        Point[] points = new Point[10];

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(i,i);
        }

        for (int i = 0; i < points.length; i++) {
            System.out.print(points[i]+" ");
        }

        System.out.println();

        Rectangle[] rectangles = new Rectangle[10];

        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle(points[i], 1, 1);
            System.out.print(rectangles[i] + " ");
        }
    }
}
