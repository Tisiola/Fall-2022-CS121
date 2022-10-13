//Tisi and Mason

import java.util.ArrayList;
import java.util.Scanner;

public class GradesArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter number of courses:");
        int num = Integer.parseInt(console.nextLine());
        System.out.println();

        String courses;
        int hours, scores;

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> nums = new ArrayList<Integer>();

        //names.add();

        for (int i = 0; i < num; i++) {
            int j = i + 1;
            System.out.printf("Enter course %d name:\n", j);
            courses = console.nextLine();
            System.out.printf("Enter course %d credit hours:\n", j);
            hours = Integer.parseInt(console.nextLine());
            System.out.printf("Enter course %d score:\n", j);
            scores = Integer.parseInt(console.nextLine());
            System.out.println();
        }
        names.add(courses);

    }
}
