
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point, Point anotherPoint) {
        double distance = 0;
        distance = Math.sqrt(Math.pow(anotherPoint.x - point.x, 2)) + Math.pow(anotherPoint.y - point.y, 2);
        return distance;
    }
}
