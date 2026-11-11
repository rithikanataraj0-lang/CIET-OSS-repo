
class Person {
    String name;
    int age;

    // Constructor of Person class
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNo;
    String course;

    // Constructor of Student class
    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    // Method to display student details
    void display() {
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Arun", 20, 101, "Computer Science");

        s1.display();
    }
}
