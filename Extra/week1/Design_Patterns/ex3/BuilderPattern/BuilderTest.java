public class BuilderTest {
    public static void main(String[] args) {
        // Basic configuration
        Computer basicComputer = new Computer.Builder("Intel i3", "4GB").build();

        // High-end configuration
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .build();

        // Display configurations
        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
// This class tests the Builder pattern implementation for creating different configurations of a computer.
// It creates a basic computer and a high-end gaming computer, then prints their configurations.