
import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    int rollNo;
    String name;
    double cgpa;

    Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class exp_15 {
    public static void main(String[] args) {
        String fileName = "student.ser";

        Student s1 = new Student(101, "Amit", 8.6);

        // Serialization: write object to file
        try (ObjectOutputStream out =
                new ObjectOutputStream(
                    new FileOutputStream(fileName))) {

            out.writeObject(s1);
            System.out.println("Serialization successful.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
            return;
        }

        // Deserialization: read object from file
        try (ObjectInputStream in =
                new ObjectInputStream(
                    new FileInputStream(fileName))) {

            Student s2 = (Student) in.readObject();

            System.out.println("Deserialization successful.");
            System.out.println("Student Details:");
            s2.display();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
