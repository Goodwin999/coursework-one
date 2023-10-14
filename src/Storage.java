public class Storage {

    private Employee[] employee;

    public Storage() {
        employee = new Employee[10];

        employee[0] = new Employee("Достоевский", "Федор", "Михайлович", 1, 50_000);
        employee[1] = new Employee("Лермонтов", "Михаил", "Юрьевич", 2, 52_000);
        employee[2] = new Employee("Гоголь", "Николай", "Васильевич", 3, 51_000);
        employee[3] = new Employee("Пешков", "Алексей", "Максимович", 4, 51_500);
        employee[4] = new Employee("Фет", "Афанасий", "Афанасьевич", 5, 53_000);
        employee[5] = new Employee("Есенин", "Сергей", "Александрович", 1, 700_000);
        employee[6] = new Employee("Чехов", "Антон", "Павлович", 2, 55_000);
        employee[7] = new Employee("Толстой", "Лев", "Николаевич", 3, 60_000);
        employee[8] = new Employee("Булгаков", "Михаил", "Афанасьевич", 4, 65_000);
        employee[9] = new Employee("Пушкин", "Александр", "Сергеевич", 5, 72_000);
    }

    public void getAllEmployeeDate() {
        for (int i = 0; i < employee.length - 1; i++) {
            System.out.println(employee);
        }
    }

    public double findTotalMonthlySalary() {
        double sum = 0;
        for (Employee value : employee) {
            sum += value.getSalary();
        }
        return sum;
    }

    public Employee findEmployeeMinSalary() {
        Employee poorEmpl = employee[0];
        for (Employee employee : employee) {
            if (poorEmpl.getSalary() > employee.getSalary()) {
                poorEmpl = employee;
            }
        }
        return poorEmpl;
    }

    public Employee findEmployeeMaxSalary() {
        Employee richEmpl = employee[0];
        for (Employee employee : employee) {
            if (richEmpl.getSalary() < employee.getSalary()) {
                richEmpl = employee;
            }
        }
        return richEmpl;

    }

    public double findTheAverageSalary() {
        return findTotalMonthlySalary() / employee.length;
    }

    public void printFIO() {
        for (Employee employee : employee) {
            System.out.println(employee.toString());
        }
    }
}





