public class Polygon {
    private Point[] points;

    public Polygon(Point[]points) {
        this.points = points;
    }
    public Polygon() {
        points = new Point[100];
        for (int i = 0; i < points.length; i++) {
            points [i] = null;
        }
    }

    @Override
    public String toString() {
        String s = " ";
        for(int i = 0; i< points.length; i++) {
            s = s + points[i] + " - ";
        }
        s = s + points[0];
        return s;
    }

    public double getLength(){
        double lenght = 0;
        for(int i = 0; i < points.length - 1; i++) {
            Segment side = new Segment(points[i], points[i + 1]);
            lenght += side.getModule();
        }
        Segment side = new Segment(points[points.length - 1],points[0]);
        lenght += side.getModule();
        return lenght;
    }

    public void setOffset(int offX, int offY) {
        for (int i = 0; i< points.length; i++) {

        }
    }
}
