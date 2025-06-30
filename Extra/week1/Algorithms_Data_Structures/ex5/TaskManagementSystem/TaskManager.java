public class TaskManager {
    static TaskNode head = null;

    public static void main(String[] args) {
        addTask(new Task(1, "Design UI", "Pending"));
        addTask(new Task(2, "Develop Backend", "In Progress"));
        addTask(new Task(3, "Test App", "Pending"));

        System.out.println("All Tasks:");
        traverseTasks();

        System.out.println("\nSearching for Task ID 2:");
        searchTask(2);

        System.out.println("\nDeleting Task ID 2...");
        deleteTask(2);

        System.out.println("\nTasks After Deletion:");
        traverseTasks();
    }

    public static void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static void traverseTasks() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public static void searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                System.out.println("Found: " + current.task);
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found.");
    }

    public static void deleteTask(int taskId) {
        if (head == null)
            return;

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        TaskNode current = head;
        while (current.next != null) {
            if (current.next.task.taskId == taskId) {
                current.next = current.next.next;
                System.out.println("Task deleted.");
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found.");
    }
}
