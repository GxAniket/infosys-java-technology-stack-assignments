class Point {
    private double xCoordinate;
    private double yCoordinate;

    // Constructor
    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    // Getters (⚠️ exact names required)
    public double getxCoordinate() {
        return xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    // Setters (⚠️ exact names required)
    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    // Distance from origin
    public double calculateDistance() {
        double distance = Math.sqrt(xCoordinate * xCoordinate + yCoordinate * yCoordinate);
        return Math.round(distance * 100.0) / 100.0;
    }

    // Distance from another point
    public double calculateDistance(Point point) {
        double dx = this.xCoordinate - point.getxCoordinate();
        double dy = this.yCoordinate - point.getyCoordinate();

        double distance = Math.sqrt(dx * dx + dy * dy);
        return Math.round(distance * 100.0) / 100.0;
    }
}
