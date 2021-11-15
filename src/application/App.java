package application;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double percentage;

        employee employee = new employee(); // instanciando o objeto
        System.out.print("Name: ");
        employee.name = input.nextLine();// ler mais de uma palavra(ler ate a quebra de linha)""
        System.out.print("Gross Salary: ");
        employee.glossSalary = input.nextDouble();
        System.out.print("Tax: ");
        employee.tax = input.nextDouble();

        System.out.println("Employee:" + employee.name + ", $" + employee.netSalary());

        System.out.print("Witch percentage to increat salary?");
        percentage = input.nextDouble();

        System.out.println("Update data: " + employee.name + ", $" + employee.increaseSalary(percentage));

        input.close();

    }
}
