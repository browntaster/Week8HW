package Q8Polymorphism;

public class Employee {

    public void calculateSalary(String name) {
        System.out.println(name);
    }

    public void Manager() {
        System.out.println("Manager's Salary: ");
    }

    public void Programmer() {
        System.out.println("Programmer's Salary: ");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.calculateSalary("Base Salary");
        e.Manager();
        e.Programmer();
    }
}
