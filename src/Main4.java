public class Main4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r);
        r.moveTo(4, 7);
        System.out.println(r);
        Rectangle rectangle2 = new Rectangle(new Point(1, 1), 8, 6);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle(new Point(2,2), new Point(5,8));
        System.out.println(rectangle3);
        Rectangle rectangle4 = new Rectangle(new Segment(new Point(2,2), new Point(5,8)));
        System.out.println(rectangle4);
        System.out.println(rectangle4.getPoint());
        Rectangle rectangle5 = new Rectangle(new Point(5,6), 10, 8);
        System.out.println("Arriba-Izquierda: " + rectangle5.getTopLeftPoint() + " Arriba-Derecha: " + rectangle5.getTopRightPoint() + " Abajo-Izquierda: " + rectangle5.getBottomLeftPoint() + " Abajo-Derecha: " + rectangle5.getBottomRightPoint());
    }
}
