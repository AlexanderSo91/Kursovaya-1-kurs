package Kursovaya;

import java.util.Arrays;

public class Main {
    private static final Employee[] workers = {
            new Employee("Александр Владимирович Харитонов", 1, 13000),
            new Employee("Лев Николаевач Зюкин", 2, 20000),
            new Employee("Николай Николаевач Петров", 2, 20000),
            new Employee("Евгений Алексанрович Федоров", 3, 15000),
            new Employee("Константин Олегович Костромин", 4, 12000),
            new Employee("Альберт Александрович Олежко", 5, 11000),
            new Employee("Борис Олегович Козлов", 5, 19000),
            new Employee("Роман Константинович Шавырногов", 3, 15000),
            new Employee("Дмитрий Константинович Олигархов", 4, 16000),
            new Employee("Алексей Альбертович Долларов", 1, 13000),
    };
    public static void main(String[] args) {
        printAllEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц - " + salaryExpensesMonth());
        System.out.println(minSalaryMonth());
        System.out.println(maxSalaryMonth());
        System.out.println("Средняя зарплата -  " + averageValue());
        printName();
    }
    public static void printAllEmployees(){
        System.out.println(Arrays.toString(workers));
    }

    public static int salaryExpensesMonth() {
        int salarysome = 0;
        for (Employee employees : workers) {
            salarysome = salarysome + employees.getSalary();
        }
        return salarysome;
    }

    public static Employee minSalaryMonth() {
        System.out.print("Сотрудник с минимальной зарплатой - ");
        Employee result = workers[0];
        int minSalary = workers[0].getSalary();
        for (Employee worker : workers) {
            if (worker.getSalary() < minSalary) {
                minSalary = worker.getSalary();
                result = worker;
            }
        }
        return result;
    }

    public static Employee maxSalaryMonth() {
        System.out.print("Сотрудник с максимальной зарплатой - ");
        Employee result = workers[0];
        int maxSalary = workers[0].getSalary();
        for (Employee worker : workers) {
            if (worker.getSalary() > maxSalary) {
                maxSalary = worker.getSalary();
                result = worker;
            }
        }
        return result;
    }

    public static float averageValue() {
        return salaryExpensesMonth() / (float) workers.length;
    }

    public static void printName() {
        for (Employee worker : workers) {
            System.out.print("[" + worker.getName() + "] ");
        }
    }
}











