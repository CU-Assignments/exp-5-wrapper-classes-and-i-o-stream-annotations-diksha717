import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee\n2. Display Employees\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                addEmployee(sc);
            } else if (choice == 2) {
                displayEmployees();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        sc.close();
    }

    static void addEmployee(Scanner sc) {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();
        System.out.print("Enter Salary: ");
        String salary = sc.nextLine();

        try (FileWriter fw = new FileWriter("employees.txt", true)) {
            fw.write(name + "," + id + "," + designation + "," + salary + "\n");
            System.out.println("Employee added successfully.");
        } catch (IOException e) {
            System.out.println("Error saving employee.");
        }
    }

    static void displayEmployees() {
        try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("No employees found.");
        }
    }
}
