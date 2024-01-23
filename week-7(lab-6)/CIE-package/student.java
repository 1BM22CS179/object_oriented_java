package CIE;

import java.util.Scanner;

public class Student {
    protected String usn;
    protected String name;
    protected int sem;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USN:");
        usn = scanner.nextLine();
        System.out.println("Enter Name:");
        name = scanner.nextLine();
        System.out.println("Enter Semester:");
        sem = scanner.nextInt();
    }
}
