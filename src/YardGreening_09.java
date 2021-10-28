import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {

        double area;
        try (Scanner Scanner = new Scanner(System.in)) {
            area = Double.parseDouble(Scanner.nextLine());
        }
        double cena = 7.61;
        double finalPrice = area * cena;
        double ots = 0.18 * finalPrice;
        double otstapka = finalPrice - ots;

        System.out.println("The final price is: " + otstapka + " lv.");
        System.out.println("The discount is: " + ots + " lv.");
    }
}
