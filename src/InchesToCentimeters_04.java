import java.util.Scanner;

public class InchesToCentimeters_04 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double a = Double.parseDouble(Scanner.nextLine());
        double sm = 2.54;
        double inch=a*sm;
        System.out.println(inch);
    }
}
