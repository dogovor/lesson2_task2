import java.util.ArrayList;

public class Rectangles {
    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void addTriangle(Rectangle s) {
        rectangles.add(s);
    }

    public int sumAllAreas() {
        int s = 0;
        for (Rectangle i : rectangles
                )
            s = s + i.getA();

        return s;
    }

}



