public class MVCTest {
    public static void main(String[] args) {
        // Model
        Student student = new Student("Varshaa", "6396674", "A");

        // View
        StudentView view = new StudentView();

        // Controller
        StudentController controller = new StudentController(student, view);

        // Initial Display
        controller.updateView();

        // Update Model Data
        controller.setStudentName("Varshaa S.");
        controller.setStudentGrade("A+");

        // Display Updated Data
        System.out.println("\nAfter Update:");
        controller.updateView();
    }
}
