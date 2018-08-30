public class RectanglesRunning {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(7, 8);
        Rectangle r3 = new Rectangle(2, 3);

        Rectangles rrr = new Rectangles();

        rrr.addTriangle(r1);
        rrr.addTriangle(r2);
        rrr.addTriangle(r3);

        System.out.println(r1.getP());

        System.out.println(r2.getA());

        System.out.println(rrr.sumAllAreas());

    }
}
