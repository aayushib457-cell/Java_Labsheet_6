import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(sc.nextLine());

            System.out.println("Division: " + (a / b));

            int arr[] = {10, 20, 30, 40, 50};

            System.out.print("Enter array index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Element: " + arr[index]);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
        catch (NumberFormatException e) {
            System.out.println("Enter valid numbers!");
        }
    }
}
    

