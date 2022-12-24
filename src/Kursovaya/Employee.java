package Kursovaya;

import java.util.Objects;

public class Employee {
    private final String name;
    private int department;
    private int salary;
    private final int id;
    private static int counter;


    public Employee(String name, int department, int salary) {

        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter++;
    }


    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public static void salaryExpensesMonth(Employee[] employee) {
        System.out.print("Сумма затрат на зарплаты в месяц - ");
        int salarysome = 0;
        for (Employee employees : employee) {
            salarysome = salarysome + employees.getSalary();
        }
        System.out.println(salarysome + " рублей");
    }

    public static void minSalaryMonth(Employee[] employee) {
        System.out.print("Сотрудник с минимальной зарплатой - ");
        int minSalary = employee[0].getSalary();
        for (Employee employees : employee) {
            if (employees.getSalary() < minSalary) {
                minSalary = employees.getSalary();
            }
        }
        System.out.println(minSalary + " рублей");

    }


    public static void maxSalaryMonth(Employee[] employee) {
        System.out.print("Сотрудник с максимальной зарплатой - ");
        int maxSalary = employee[0].getSalary();
        for (Employee employees : employee) {
            if (employees.getSalary() > maxSalary) {
                maxSalary = employees.getSalary();
            }
        }
        System.out.println(maxSalary + " рублей");


    }


    public static void averageValue(Employee[] employee) {
        System.out.print("Среднее значение зарплат - ");
        int averageValue = employee[0].getSalary();
        for (Employee employees : employee) {
            averageValue = averageValue + employees.getSalary();
        }
        System.out.println(averageValue +" рублей");
    }




    public static void printName(Employee[] workers) {
        for (Employee worker : workers) {
            System.out.println(worker.getName() + " ");
        }
    }
}




