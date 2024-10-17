package MartyATheodore;

import java.util.*;

public class StudentRecord {
    public void sortStudentNames(String[] students, int sortOrder) {
        Arrays.sort(students);
        String[] sortedArray = new String[students.length];
        switch (sortOrder) {
            case 1 -> System.arraycopy(students, 0, sortedArray, 0, students.length);
            case 2 -> {
                for (int i = students.length - 1; i >= 0; i--) {
                    System.out.println(i);
                    sortedArray[students.length - i - 1] = students[i];
                }
            }
            default -> throw new IllegalStateException("Unexpected value: " + sortOrder);
        }
        // List all elements of the Array
        Arrays
                .stream(sortedArray)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        StudentRecord students = new StudentRecord();
        Scanner input = new Scanner(System.in);
        System.out.println("How many students do you have: ");
        int numberOfStudents = input.nextInt();
        String[] studentRecord = new String[numberOfStudents];
        // Get student names
        int i = 0;
        while (i < studentRecord.length) {
            System.out.println("Enter a student name: ");
            studentRecord[i] = input.next();
            i++;
        }

        System.out.println("Unsorted: ");
        for (String name: studentRecord) {
            System.out.println(name);
        }

        System.out.println("Would you like the students sorted in: \"" +
                "1. Alphabetic order \"" +
                "2. Reverse alphabetic order: ");
        int orderInput = input.nextInt();
        students.sortStudentNames(studentRecord, orderInput);
    }
}
