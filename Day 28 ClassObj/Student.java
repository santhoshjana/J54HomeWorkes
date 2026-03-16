import java.util.Scanner;

class Student {

    String name;
    int rollNo;

    void addStudent(String n, int r) {
        name = n;
        rollNo = r;
        System.out.println("Student details saved");
    }

    void updateName(String newName) {
        name = newName;
        System.out.println("Student name updated");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
    
}