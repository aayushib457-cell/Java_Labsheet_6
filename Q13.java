
import java.util.Scanner;

class InvalidDosageException extends Exception {

    InvalidDosageException(String msg) {
        super(msg);
    }
}

class Q13 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter patient name: ");
            String patient = sc.nextLine();

            System.out.print("Enter drug name: ");
            String drug = sc.nextLine();

            System.out.print("Enter dosage in mg: ");
            int dosage = Integer.parseInt(sc.nextLine());

            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException(
                    "Invalid drug dosage!");
            }

            System.out.println("Patient: " + patient);
            System.out.println("Drug: " + drug);
            System.out.println("Dosage: " + dosage + " mg");
            System.out.println("Dosage is valid!");
        }
        catch (NumberFormatException e) {
            System.out.println("Enter valid numeric dosage!");
        }
        catch (InvalidDosageException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Dosage validation completed.");
        }
    }
}