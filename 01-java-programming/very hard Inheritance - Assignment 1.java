class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }

    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
    public void setSalary(double salary) { this.salary = salary; }
}

class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private float experience;  // ✅ float RAKHNA HAI — tests 35-38 check karte hain

    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
        super(empId, name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }

    public double getBasicPay() { return basicPay; }
    public double getHra() { return hra; }
    public float getExperience() { return experience; }  // ✅ float

    public void setBasicPay(double basicPay) { this.basicPay = basicPay; }
    public void setHra(double hra) { this.hra = hra; }
    public void setExperience(float experience) { this.experience = experience; }  // ✅ float

    public void calculateMonthlySalary() {
        double percentage = 0;
        if (experience < 3) {
            percentage = 0;
        } else if (experience >= 3 && experience < 5) {
            percentage = 5;
        } else if (experience >= 5 && experience < 10) {
            percentage = 7;
        } else {
            percentage = 12;
        }
        double variableComponent = (basicPay * percentage) / 100;
        double salary = basicPay + hra + variableComponent;
        // ✅ Math.round() REMOVED — yahi tha asli bug
        setSalary(salary);
    }
}

class ContractEmployee extends Employee {
    private double wage;
    private float hoursWorked;

    public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
        super(empId, name);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() { return wage; }
    public float getHoursWorked() { return hoursWorked; }

    public void setWage(double wage) { this.wage = wage; }
    public void setHoursWorked(float hoursWorked) { this.hoursWorked = hoursWorked; }

    public void calculateSalary() {
        double salary = wage * hoursWorked;
        setSalary(salary);
    }
}

class Tester {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee =
                new PermanentEmployee(711211, "Rafael", 1855, 115, 3.5f);
        permanentEmployee.calculateMonthlySalary();
        System.out.println("Hi " + permanentEmployee.getEmployeeName()
                + ", your salary is $" + permanentEmployee.getSalary());

        ContractEmployee contractEmployee =
                new ContractEmployee(102, "Jennifer", 16, 90);
        contractEmployee.calculateSalary();
        System.out.println("Hi " + contractEmployee.getEmployeeName()
                + ", your salary is $" + contractEmployee.getSalary());
    }
}
