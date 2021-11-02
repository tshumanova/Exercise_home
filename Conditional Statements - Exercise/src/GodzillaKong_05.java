import java.util.Scanner;

public class GodzillaKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double budgetFilm = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        Double priceForClothing = Double.parseDouble(scanner.nextLine());

        double decor = budgetFilm * 0.10;
        double sumClothing = extras * priceForClothing;
        double total = 0.0;
        if (extras > 150) {
            sumClothing = sumClothing - (sumClothing * 0.10);
            total = decor + sumClothing;
        } else {
            sumClothing = sumClothing;
            total = decor + sumClothing;
        }
        double total1 = total - budgetFilm;
        if (total > budgetFilm) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", total1);

        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budgetFilm - total);
        }


    }

}
