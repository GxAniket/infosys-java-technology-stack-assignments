class Point {
    private double xCoordinate;
    private double yCoordinate;

    // Parameterless constructor (Likely expected from Exercise 1)
    public Point() {
        this.xCoordinate = 0.0;
        this.yCoordinate = 0.0;
    }

    // Constructor with parameters
    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    // Overloaded method to calculate distance from origin
    public double calculateDistance() {
        double distance = Math.sqrt(Math.pow(this.xCoordinate, 2) + Math.pow(this.yCoordinate, 2));
        return Math.round(distance * 100.0) / 100.0;
    }

    // Overloaded method to calculate distance from another point
    public double calculateDistance(Point point) {
        double distance = Math.sqrt(Math.pow(point.getxCoordinate() - this.xCoordinate, 2) + 
                                    Math.pow(point.getyCoordinate() - this.yCoordinate, 2));
        return Math.round(distance * 100.0) / 100.0;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public String toString() {
        return "Point\nxCoordinate: " + this.getxCoordinate() + "\nyCoordinate: " + this.getyCoordinate();
    }
}

class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    // Parameterless constructor with default coordinates
    public Triangle() {
        this.point1 = new Point(0.0, 0.0);
        this.point2 = new Point(1.0, 1.0);
        this.point3 = new Point(2.0, 5.0);
    }

    // Constructor taking separate primitive double coordinates
    public Triangle(double point1XCoordinate, double point1YCoordinate, 
                    double point2XCoordinate, double point2YCoordinate, 
                    double point3XCoordinate, double point3YCoordinate) {
        this.point1 = new Point(point1XCoordinate, point1YCoordinate);
        this.point2 = new Point(point2XCoordinate, point2YCoordinate);
        this.point3 = new Point(point3XCoordinate, point3YCoordinate);
    }

    // Constructor taking Point objects
    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double calculatePerimeter() {
        // Fetching the rounded lengths first to match exact sample outputs
        double a = point1.calculateDistance(point2);
        double b = point2.calculateDistance(point3);
        double c = point3.calculateDistance(point1);

        double perimeter = a + b + c;
        return Math.round(perimeter * 100.0) / 100.0;
    }

    public double calculateArea() {
        // Fetching the rounded lengths first to match exact sample outputs
        double a = point1.calculateDistance(point2);
        double b = point2.calculateDistance(point3);
        double c = point3.calculateDistance(point1);

        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return Math.round(area * 100.0) / 100.0;
    }

    // Getters and Setters
    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }
}

class Tester {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(1.0, 2.0, 6.0, 5.0, 5.0, 1.0);
        
        Point point1 = new Point(2.0, 1.0);
        Point point2 = new Point(4.0, 4.0);
        Point point3 = new Point(9.0, 1.0);
        Triangle triangle3 = new Triangle(point1, point2, point3);		
        
        System.out.println("Perimeter of triangle1 is " + triangle1.calculatePerimeter());
        System.out.println("Area of triangle1 is " + triangle1.calculateArea());
        System.out.println();
        
        System.out.println("Perimeter of triangle2 is " + triangle2.calculatePerimeter());
        System.out.println("Area of triangle2 is " + triangle2.calculateArea());
        System.out.println();
        
        System.out.println("Perimeter of triangle3 is " + triangle3.calculatePerimeter());
        System.out.println("Area of triangle3 is " + triangle3.calculateArea());
    }
}
