public class TaskNode {
    Task task;
    TaskNode next;

    public TaskNode(Task task) {
        this.task = task;
        this.next = null;
    }
}
// This class represents a node in the linked list for the task management
// system.
// Each node contains a Task object and a reference to the next node in the
// list.
// It is used to create a linked list structure to manage tasks efficiently.