package Kursovaya;

import java.io.OptionalDataException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Employee[] workers = new Employee[10];
        workers[0] = new Employee("Александр Владимирович Харитонов", 1, 13000);
        workers[1] = new Employee("Лев Николаевач Зюкин", 2, 20000);
        workers[2] = new Employee("Николай Николаевач Петров", 2, 20000);
        workers[3] = new Employee("Евгений Алексанрович Федоров", 3, 15000);
        workers[4] = new Employee("Константин Олегович Костромин", 4, 12000);
        workers[5] = new Employee("Альберт Александрович Олежко", 5, 11000);
        workers[6] = new Employee("Борис Олегович Козлов", 5, 19000);
        workers[7] = new Employee("Роман Константинович Шавырногов", 3, 15000);
        workers[8] = new Employee("Дмитрий Константинович Олигархов", 4, 16000);
        workers[9] = new Employee("Алексей Альбертович Долларов", 1, 13000);


        System.out.println(Arrays.toString(workers));


        Main.salaryExpensesMonth(workers);
        Main.minSalaryMonth(workers);
        Main.maxSalaryMonth(workers);
        Main.averageValue(workers);

        System.out.println();

        Main.printName(workers);
    }


    public static void salaryExpensesMonth(Employee[] employee) {
        System.out.print("Сумма затрат на зарплаты в месяц - ");
        int salarysome = 0;
        for (Employee employees : employee) {
            salarysome = salarysome + employees.getSalary();
        }
        System.out.println(salarysome + " рублей");
    }

    public static Employee minSalaryMonth(Employee[] employee) {
        System.out.print("Сотрудник с минимальной зарплатой - ");
        Employee result = employee[0];
        int minSalary = employee[0].getSalary();
        for (Employee employees : employee) {
            if (employees.getSalary() < minSalary) {
                minSalary = employees.getSalary();
                result = employee;

            }
        }
        return result;

    }


    public static Employee maxSalaryMonth(Employee[] employee) {
        System.out.print("Сотрудник с максимальной зарплатой - ");
        Employee result = employee[0];
        int maxSalary = employee[0].getSalary();
        for (Employee employees : employee) {
            if (employees.getSalary() > maxSalary) {
                maxSalary = employees.getSalary();
                result = employee;
            }
        }
        return result;


    }


    public static void averageValue(Employee[] employee) {



    }


    public static void printName(Employee[] workers) {
        for (Employee worker : workers) {
            System.out.println(worker.getName() + " ");
        }
    }
}











