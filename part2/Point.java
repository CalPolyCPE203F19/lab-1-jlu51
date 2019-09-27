public class Point { 

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() { return x; }

    public double getY() { return y; }

    public double getRadius(){
        // double temp = Math.pow(x, 2.0) - Math.pow(y, 2.0);
        // return Math.sqrt(temp);
        return Math.sqrt(Math.pow(x, 2.0) - Math.pow(y, 2.0));
    }

    public double getAngle(){
        return 2 * Math.atan((y) / x);
    }

    public Point rotate90(){
        
    }






}