import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter student marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new ArithmeticException("Invalid marks!");
            }

            System.out.println("Valid marks: " + marks);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
    

