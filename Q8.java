import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            try {
                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                System.out.println("Division: " + (a / b));

                try {
                    int arr[] = {10, 20, 30, 40, 50};

                    System.out.print("Enter index: ");
                    int index = sc.nextInt();

                    System.out.println("Element: " + arr[index]);
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid array index!");
                }
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        }
    }
}
