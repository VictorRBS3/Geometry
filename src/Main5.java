public class Main5 {
    public static void main(String[] args) {
        Point[] array = new Point[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Point(i,i);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        System.out.println();

        Rectangle[] array2 = new Rectangle[10];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = new Rectangle(new Point(i,i),1,1);
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+" ");
        }

    }
}
