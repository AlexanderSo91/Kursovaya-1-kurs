package Kursovaya;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] workers = new Employee[10];
        workers[0] = new Employee("Александр Владимирович Харитонов", 1, 13000);
        workers[1] = new Employee("Лев Николаевач Зюкин", 2, 20000);
        workers[2] = new Employee("Николай Николаевач Петров", 2, 20000);
        workers[3] = new Employee("Евгений Алексанрович Федоров",  3, 15000);
        workers[4] = new Employee("Константин Олегович Костромин",  4, 12000);
        workers[5] = new Employee("Альберт Александрович Олежко", 5, 11000);
        workers[6] = new Employee("Борис Олегович Козлов", 5, 19000);
        workers[7] = new Employee("Роман Константинович Шавырногов", 3, 15000);
        workers[8] = new Employee("Дмитрий Константинович Олигархов", 4, 16000);
        workers[9] = new Employee("Алексей Альбертович Долларов", 1, 13000);


        System.out.println(Arrays.toString(workers));


        Employee.salaryExpensesMonth(workers);
        Employee.minSalaryMonth(workers);
        Employee.maxSalaryMonth(workers);
        Employee.averageValue(workers);

        System.out.println();

        Employee.printName(workers);






    }

}









