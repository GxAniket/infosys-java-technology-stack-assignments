class Camera {
    private String brand;
    private double cost;

    // Default constructor
    public Camera() {
        this.brand = "Nikon";
    }

    // Parameterized constructor
    public Camera(String brand, double cost) {
        this.brand = brand;
        this.cost = cost;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public double getCost() {
        return cost;
    }

    // Setters ✅ (REQUIRED)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

class DigitalCamera extends Camera {
    private int memory;

    public DigitalCamera(String brand, double cost) {
        super(brand, cost);  // important
        this.memory = 16;
    }

    // Getter
    public int getMemory() {
        return memory;
    }

    // Setter ✅ (REQUIRED)
    public void setMemory(int memory) {
        this.memory = memory;
    }
}

class Tester {
    public static void main(String[] args) {
        DigitalCamera camera = new DigitalCamera("Canon", 100);
        System.out.println(camera.getBrand() + " " + camera.getCost() + " " + camera.getMemory());
    }
}
