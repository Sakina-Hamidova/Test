import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Sako");
        Employee Sakina = new Employee();
        System.out.println(employee.getName());
        employee.setSurname("Hamidova");
        System.out.println(employee.surname);
        employee.setSalary(45.7);

        Scanner scan = new Scanner(System.in);
        System.out.print("n=");
        int n = scan.nextInt();
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * 1;
        }
            System.out.println(n + "! = " + f);

    }
}




