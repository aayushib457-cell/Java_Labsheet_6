import java.util.Scanner;

class InvalidMarksException extends Exception {

    InvalidMarksException(String msg) {
        super(msg);
    }
}

class Q10 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Invalid marks!");
            }

            System.out.println("Valid marks: " + marks);
        }
        catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
