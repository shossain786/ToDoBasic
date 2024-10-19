package org.saddy.todo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOperator {
    public static void main(String[] args) {
        System.out.println("!! Welcome to TO-DO APP !!");
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Exit Task");
            System.out.println("Enter your choice: ");
            int choice = -1;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();
                continue;

            }
            switch (choice) {
                case 1:
                    System.out.println("Enter task name: ");
                    String name = scanner.nextLine();
                    taskManager.addTask(new Task(name));
                    System.out.println(name + " added to your task list successfully!");
                    break;
                case 2:
                    System.out.println("Your Tasks:");
                    for (Task task : taskManager.getTasks())
                        System.out.println(task.getTaskName());
                    break;
                case 3:
                    System.out.println("Existing...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please select a correct option!");
            }
        }
    }
}
