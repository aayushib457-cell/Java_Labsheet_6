import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int arr[] = {10, 20, 30, 40, 50};

            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Element: " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}