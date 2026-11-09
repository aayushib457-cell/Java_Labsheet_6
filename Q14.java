
import java.util.Scanner;

class InvalidExamMarksException extends Exception {

    InvalidExamMarksException(String msg) {
        super(msg);
    }
}

class Q14 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter student marks: ");
            int marks = Integer.parseInt(sc.nextLine());

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException(
                    "Invalid exam marks!");
            }

            if (marks >= 40) {
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Enter valid marks!");
        }
        catch (InvalidExamMarksException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Exam evaluation completed.");
        }
    }
}