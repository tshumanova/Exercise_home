import java.util.Scanner;

public class ConcatenateData_06 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String firstName = Scanner.nextLine();
        String lastName = Scanner.nextLine();
        int age = Integer.parseInt(Scanner.nextLine());
        String town = Scanner.nextLine();
        System.out.println("You are " + firstName + " " + lastName + ", " + "a " + age + "-years old person " + "from " + town + ".");
    }
}
