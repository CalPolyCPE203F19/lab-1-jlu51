public class Point { 

    private double x;
    private double y;

    public Point(double x, double y) {
        x = x;
        y = y;

    }

    public double getX() { return x; }

    public double getY() { return y; }

    public double getRadius(){
        double temp = Math.pow(x, 2.0) - Math.pow(y, 2.0);
        return Math.sqrt(temp);

    }

    









}