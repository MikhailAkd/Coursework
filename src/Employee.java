import java.util.Objects;

public class Employee {

    private String surname;

    private String name;

    private String patronymic;

    private int department;

    private int salary;

    private static int counter;

    private Integer id;

    public Employee(String surname, String name, String patronymic, int department, int salary){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public Integer getId() {
        return id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String fullName() {
        return surname + " " + name + " " + patronymic;
    }

    @Override
    public String toString() {
        return "ФИО: " + surname + " " + name + " " + patronymic + ". Отдел: " + department + ". Зарплата: " + salary + ". ID: "+ id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name) && Objects.equals(patronymic, employee.patronymic) && Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic, department, salary, id);
    }
}
