/* Student Management System by LinkList */

import java.util.*;

public class LinkListOnStudent {
    String name, id, phone;
    float cgpa;

    LinkListOnStudent(String n, String i, String p, float c) {
        name = n;
        id = i;
        phone = p;
        cgpa = c;
    }

    public static void main(String[] args) {
        LinkedList<LinkListOnStudent> students = new LinkedList<>();
        System.out.print("Enter number of students: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        input.nextLine();
        for (int i = 0; i < x; i++) {
            String name, id, phone;
            float cgpa;
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Enter name: ");
            name = input.nextLine();
            System.out.print("Enter ID: ");
            id = input.nextLine();
            System.out.print("Enter phone: ");
            phone = input.nextLine();
            System.out.print("Enter CGPA: ");
            cgpa = input.nextFloat();
            input.nextLine();
            LinkListOnStudent student = new LinkListOnStudent(name, id, phone, cgpa);
            students.add(student);
        }
        input.close();
        System.out.println("Details of all students:");
        for (LinkListOnStudent student : students) {
            System.out.println("\n#..Show details for student..#: ");
            System.out.println("Name\t\t: " + student.name + "\nID\t\t: " + student.id + "\nPhone\t\t: " + student.phone
                    + "\nCGPA\t\t: " + student.cgpa);
        }
    }
}
