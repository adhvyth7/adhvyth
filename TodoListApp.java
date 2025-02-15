import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {

    private static ArrayList<String> todoList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nTodo List Menu:");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. View tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    viewTasks();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter the task to add: ");
        String task = scanner.nextLine();
        todoList.add(task);
        System.out.println("Task added: " + task);
    }

    private static void removeTask() {
        if (todoList.isEmpty()) 
    }
}
