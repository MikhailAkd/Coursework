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
        System.out.println("Среднее значение зарплат: " + ((float) sum / employees.length));
        System.out.println();
    }

    public static void salaryIndex(int index) {
        if (index <= 0) {
            throw new IllegalArgumentException("Индексация должна быть положительной");
        }
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (index / 100f + 1)));
        }
        System.out.println("Зарплата сотрудников повышена на " + index + "%. Обновленные данные: ");
        for(Employee employee :employees) {
            System.out.println(employee);
        }
        System.out.println();
    }

    public static void minSalaryDepartment(int numberDepartment) {
        if (numberDepartment <= 0 || numberDepartment > 5) {
            throw new IllegalArgumentException("В организации нет такого отдела");
        }
        Employee minSalaryEmployeeDepartment = employees[numberDepartment - 1];
        int minSalary = employees[numberDepartment - 1].getSalary();
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment && minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                minSalaryEmployeeDepartment = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в выбранном отделе - " + minSalaryEmployeeDepartment);
        System.out.println();
    }

    public static void maxSalaryDepartment(int numberDepartment) {
        if (numberDepartment <= 0 || numberDepartment > 5) {
            throw new IllegalArgumentException("В организации нет такого отдела");
        }
        Employee minSalaryEmployeeDepartment = employees[numberDepartment - 1];
        int minSalary = employees[numberDepartment - 1].getSalary();
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment && minSalary < employee.getSalary()) {
                minSalary = employee.getSalary();
                minSalaryEmployeeDepartment = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в выбранном отделе - " + minSalaryEmployeeDepartment);
        System.out.println();
    }

    public static void salaryCostsDepartment(int numberDepartment) {
        if (numberDepartment <= 0 || numberDepartment > 5) {
            throw new IllegalArgumentException("В организации нет такого отдела");
        }
        int sumSalaryDepartment = 0;
        int i = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                sumSalaryDepartment += employee.getSalary();
                i++;
            }
        }
        System.out.println("Сумма затрат на зарплаты в выбранном отделе: " + sumSalaryDepartment);
        System.out.println();
        System.out.println("Среднее значение зарплат: " + ((float) sumSalaryDepartment / i));
        System.out.println();
    }

    public static void salaryIndexDepartment(int numberDepartment, int indexDepartment) {
        if (indexDepartment <= 0) {
            throw new IllegalArgumentException("Индексация должна быть положительной");
        }
        if (numberDepartment <= 0 || numberDepartment > 5) {
            throw new IllegalArgumentException("В организации нет такого отдела");
        }
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (indexDepartment / 100f + 1)));
            }
        }
        System.out.println("Зарплата сотрудников " + numberDepartment + " отдела повышена на " + indexDepartment + "%. Обновленные данные: ");
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                System.out.println("ФИО: " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic() + ". Зарплата: " + employee.getSalary() + ". ID: " + employee.getId());
            }
        }
        System.out.println();
    }

    public static void listOfEmployeesDepartment (int numberDepartment) {
        if (numberDepartment <= 0 || numberDepartment > 5) {
            throw new IllegalArgumentException("В организации нет такого отдела");
        }
        System.out.println("Список сотрудников " + numberDepartment + " отдела:");
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                System.out.println("ФИО: " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic() + ". Зарплата: " + employee.getSalary() + ". ID: " + employee.getId());
            }
        }
        System.out.println();
    }

    public static void selectionEmployees (int desiredSalary) {
        if (desiredSalary <= 0) {
            throw new IllegalArgumentException("Зарплата должна быть положительным числом");
        }
        System.out.println("Сотрудники с зарплатой ниже заданного значения: ");
        for (Employee employee : employees) {
            if (desiredSalary > employee.getSalary()) {
                System.out.println("ФИО: " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic() + ". Зарплата: " + employee.getSalary() + ". ID: " + employee.getId());
            }
        }
        System.out.println();
        System.out.println("Сотрудники с зарплатой выше заданного значения: ");
        for (Employee employee : employees) {
            if (desiredSalary <= employee.getSalary()) {
                System.out.println("ФИО: " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic() + ". Зарплата: " + employee.getSalary() + ". ID: " + employee.getId());
            }
        }
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

        salaryIndex(5);

        minSalaryDepartment(2);

        maxSalaryDepartment(1);

        salaryCostsDepartment(3);

        salaryIndexDepartment(4, 3);

        listOfEmployeesDepartment(5);

        selectionEmployees(45000);
    }
}
