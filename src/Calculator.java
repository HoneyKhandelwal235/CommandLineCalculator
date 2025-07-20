import java.util.Scanner;

public class Calculator {

    public static void showMenu() {
        System.out.println("\n=== Command-Line Calculator ===");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.println("6. Exit");
        System.out.print("Enter your choice (1-6): ");
    }

    public static double performOperation(double a, double b, int choice) {
        switch (choice) {
            case 1: return a + b;
            case 2: return a - b;
            case 3: return a * b;
            case 4: 
                if (b == 0) {
                    System.out.println("❌ Error: Division by zero!");
                    return Double.NaN;
                }
                return a / b;
            case 5: 
                if (b == 0) {
                    System.out.println("❌ Error: Division by zero!");
                    return Double.NaN;
                }
                return a % b;
            default: 
                System.out.println("❌ Invalid choice!");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("👋 Exiting... Thank you!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = performOperation(num1, num2, choice);
            if (!Double.isNaN(result)) {
                System.out.println("✅ Result: " + result);
            }

        } while (true);

        sc.close();
    }
}
