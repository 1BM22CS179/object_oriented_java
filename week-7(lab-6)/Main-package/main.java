import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();
        Internals[] internals = new Internals[n];
        External[] externals = new External[n];

        for (int i = 0; i < n; i++) {
            internals[i] = new Internals();
            internals[i].getData();
            internals[i].getMarks();
            externals[i] = new External();
            externals[i].getData();
            externals[i].getMarks();
        }

        // Assuming you want to print the details of all students
        System.out.println("Details of all students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " Details:");
            System.out.println("USN: " + internals[i].usn);
            System.out.println("Name: " + internals[i].name);
            System.out.println("Semester: " + internals[i].sem);
            System.out.println("Internal Marks:");
            for (int j = 0; j < 5; j++) {
                System.out.println("Subject " + (j + 1) + ": " + internals[i].marks[j]);
            }
            System.out.println("External Marks:");
            for (int j = 0; j < 5; j++) {
                System.out.println("Subject " + (j + 1) + ": " + externals[i].marks[j]);
            }
        }
    }
}
