package Zoo;

public class Employee implements Employable{
    private String name;
    private int id;
    private int salary;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void setEmployeeId(int number) {
        id = number;
    }

    @Override
    public int getEmployeeId() {
        return id;
    }

    @Override
    public void setEmployeeName(String name) {
        this.name = name;
    }

    @Override
    public String getEmployeeName() {
        return name;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

}
