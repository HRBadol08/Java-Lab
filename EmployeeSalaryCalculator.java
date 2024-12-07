abstract class Employee {
    protected String name;
    protected double baseSalary;
    protected double bonusPercentage;
    protected int projectBonus;

    public Employee(String name, double baseSalary, double bonusPercentage, int projectBonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonusPercentage = bonusPercentage;
        this.projectBonus = projectBonus;
    }

    public abstract double calculateTotalSalary();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

class SystemAnalyst extends Employee {
    public SystemAnalyst(String name, double baseSalary) {
        super(name, baseSalary, 0.4, 1200); 
    }

    public double calculateTotalSalary() {
        return baseSalary + (baseSalary * bonusPercentage) + projectBonus;
    }
}

class Developer extends Employee {
    public Developer(String name, double baseSalary) {
        super(name, baseSalary, 0.3, 1000);
    }

    @Override
    public double calculateTotalSalary() {
        return baseSalary + (baseSalary * bonusPercentage) + projectBonus;
    }
}


class Intern extends Employee {
    public Intern(String name, double baseSalary) {
        super(name, baseSalary, 0.2, 500); 
    }

    @Override
    public double calculateTotalSalary() {
        return baseSalary + (baseSalary * bonusPercentage) + projectBonus;
    }
}


public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Employee analyst = new SystemAnalyst("Alice", 50000);
        Employee developer = new Developer("Bob", 40000);
        Employee intern = new Intern("Charlie", 20000);

        System.out.println("=== Employee Details ===");
        analyst.displayInfo();
        System.out.println();
        developer.displayInfo();
        System.out.println();
        intern.displayInfo();
    }
}
