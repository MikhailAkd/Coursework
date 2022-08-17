public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void listOfEmployeesFull() {

        System.out.println("Данные о сотрудниках: ");
        for(Employee employee :employees) {
            System.out.println(employee);
        }
        System.out.println();
    }

    public static void listOfEmployees() {

        System.out.println("Список сотрудников: ");
        for(Employee employee :employees) {
            System.out.println(employee.fullName());
        }
        System.out.println();
    }

    public static Employee minimumSalary() {

        Employee minSalaryEmployee = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee maximumSalary() {

        Employee maxSalaryEmployee = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static void salaryCosts() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
        System.out.println();
        System.out.println("Среднее значение зарплат: " + sum / employees.length);
        System.out.println();
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("Сидорова", "Юлия", "Богдановна", 1,  45900);
        Employee employee2 = new Employee("Никольский", "Тимофей", "Иванович", 2,  46300);
        Employee employee3 = new Employee("Троицкая", "Надежда", "Дмитриевна", 3,  62400);
        Employee employee4 = new Employee("Бочарова", "Анастасия", "Алексеевна", 4,  35200);
        Employee employee5 = new Employee("Кузнецов", "Александр", "Александрович", 5,  45800);
        Employee employee6 = new Employee("Никифорова", "Валерия", "Кирилловна", 5,  68100);
        Employee employee7 = new Employee("Котов", "Антон", "Григорьевич", 4,  54200);
        Employee employee8 = new Employee("Иванова", "Елизавета", "Львовна", 3,  40700);
        Employee employee9 = new Employee("Неверова", "Ева", "Марковна", 2,  63000);
        Employee employee10 = new Employee("Гофман", "Пиня", "Иосифович", 1,  71000);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;

        listOfEmployeesFull();

        salaryCosts();

        System.out.println("Минимальная зарплата - " + minimumSalary());
        System.out.println();

        System.out.println("Максимальная зарплата - " + maximumSalary());
        System.out.println();

        listOfEmployees();
    }
}
