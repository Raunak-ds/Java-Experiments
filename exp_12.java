
import java.util.*;

public class exp_12 {
    public static void main(String[] args) {
        // List: allows duplicate values
        List<String> students = new ArrayList<>();
        students.add("Amit");
        students.add("Ravi");
        students.add("Amit");

        System.out.println("Student List: " + students);

        // Set: removes duplicate values
        Set<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("Java");

        System.out.println("Course Set: " + courses);

        // Map: stores key-value pairs
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Amit");
        studentMap.put(102, "Ravi");
        studentMap.put(103, "Priya");

        System.out.println("Student Map:");
        for (Map.Entry<Integer, String> entry
                : studentMap.entrySet()) {
            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }

        // Queue: follows FIFO order
        Queue<String> queue = new LinkedList<>();
        queue.offer("Amit");
        queue.offer("Ravi");
        queue.offer("Priya");

        System.out.println("Queue before processing: " + queue);
        System.out.println("Processed: " + queue.poll());
        System.out.println("Queue after processing: " + queue);
    }
}
