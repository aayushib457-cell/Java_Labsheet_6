import java.util.Scanner;

class Q7 {

    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("You are not eligible!");
        }

        System.out.println("You are eligible.");
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            try {
                checkAge(age);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
