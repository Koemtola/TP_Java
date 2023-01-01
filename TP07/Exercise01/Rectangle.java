package Exercise01;

/**
 * Rectangle
 */
public class Rectangle {
    // let width,height it's attribute
    private int width;
    private int height;

    // constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // method perimeter
    public int perimeter() {
        return (width + height) * 2;
    }

    // method surface
    public int surface() {
        return (width * height);
    }

}
