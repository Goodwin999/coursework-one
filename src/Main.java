public class Main {

    public static void main(String[] args) {
        System.out.println("Курсовая работа 1 курса!");
        Storage storage = new Storage();
        storage.getAllEmployeeDate();
        System.out.println("Сумма затрат на зарплаты в месяц :" + storage.findTotalMonthlySalary());
        System.out.println("Сотрудник с минимальной зарплатой : " + storage.findEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой : " + storage.findEmployeeMaxSalary());
        System.out.println("Срденее значение зарплат составляет :" + storage.findTheAverageSalary());
        storage.printFIO();

    }
}

