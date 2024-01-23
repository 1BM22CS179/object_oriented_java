package SEE;

import CIE.Student;
import java.util.Scanner;

public class External extends Student {
    protected int[] marks = new int[5];

    public void getMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter External Marks for 5 Subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
        }
    }
}
