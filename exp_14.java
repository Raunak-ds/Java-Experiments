import java.io.*;

public class exp_14 {
    public static void main(String[] args) {
        String fileName = "student.txt";

        // Write data to the file
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(fileName))) {

            bw.write("Roll No: 101");
            bw.newLine();
            bw.write("Name: Amit");
            bw.newLine();
            bw.write("CGPA: 8.6");

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e);
            return;
        }

        // Read data from the file
        try (BufferedReader br = new BufferedReader(
                new FileReader(fileName))) {

            String line;
            System.out.println("File contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}
