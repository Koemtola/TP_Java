public class Circle {
    private Point center;
    private Point p;

    public Circle(Point center, Point p) {
        this.center = center;
        this.p = p;
    }

    /* get center */
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        if (center != null) {
            this.center = center;
        } else {
            System.out.println("ERROR: center couldn't be null");
        }
    }

    /* get p */
    public Point getP() {
        return p;
    }

    public void setp(Point p) {
        this.p = p;
    }

    public double length() {
        double length = 0;
        length = 2 * Math.PI * center.distance(center, p);
        return length;
    }

    public double radius() {
        return center.distance(center, p);
    }

    public double surface() {
        return Math.PI * radius() * radius();
    }

}
