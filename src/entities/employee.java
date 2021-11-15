package entities;

public class employee {

    public String name;
    public double glossSalary;
    public double tax;

    public double netSalary() {
        return glossSalary - tax;
    }

    public double increaseSalary(double percentage) {
        return (percentage / 100) * glossSalary + netSalary();
    }

}
