import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
    }

    public void setFirstName(String firstName) {
        if (firstName != null)
            this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName != null)
            this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, int age) {
        this(firstName, lastName, age, 1000.0);
    }

    public Employee(String firstName, String lastName) {
        this(firstName, lastName, 25, 1000.0);
    }

    @Override
    public String toString() {
        return "Employee: " + getFullName() + ", age " + age + " years, " + salary + "$";
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (anotherObject == null)
            return false;
        if (!(anotherObject instanceof Employee)) {
            return false;
        }

        Employee newEmployee = (Employee) anotherObject;
        return firstName.equals(newEmployee.getFirstName()) && lastName.equals(newEmployee.getLastName());
    }

    @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
}
}