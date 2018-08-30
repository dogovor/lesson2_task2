public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getP() {
        return   2 * width + 2 * height;
    }

    public int getA() {
        return width * height;
    }
}
