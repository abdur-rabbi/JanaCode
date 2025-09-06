import java.util.Scanner;

class Person {
  Scanner scanner = new Scanner(System.in);
  String name;
  byte age;
  void input() {
    System.out.print("Input name: ");
    name = scanner.nextLine();
    System.out.print("Input age: ");
    age = scanner.nextByte();
  }

  void display() {
    System.out.println("Name\t\t:" + name);
    System.out.println("Age\t\t:" + age);
  }
}

class Student extends Person {
  int id;
  String course;

  void input() {
    System.out.println("...........................Enter Student information...........................: ");
    super.input();
    System.out.print("Input ID: ");
    id = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Input course: ");
    course = scanner.nextLine();
  }

  void display() {
    System.out.println("..............................Display student information............................. ");
    super.display();
    System.out.println("Roll\t\t:" + id);
    System.out.println("Course\t\t:" + course);
  }
}

class Employe extends Person {
  int empId;
  String department;

  void input() {
    System.out.println(".....................Enter employee information.......................: ");
    super.input();
    System.out.print("Input employee ID: ");
    empId = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Input department: ");
    department = scanner.nextLine();
  }

  void display() {
    System.out.println(".................Display employee information................... ");
    super.display();
    System.out.println("Employee ID\t:" + empId);
    System.out.println("Department\t:" + department);
  }
}

public class Inheritance {

  public static void main(String[] args) {

    Student st = new Student();
    st.input();
    st.display();
    Employe em = new Employe();
    em.input();
    em.display();
  }
}
