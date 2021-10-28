import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int doc = Integer.parseInt(Scanner.nextLine());
        int cat = Integer.parseInt(Scanner.nextLine());
        double footDoc= doc*2.5;
        double footCat= cat*4;
        double foot = footDoc+footCat;
        System.out.println(foot+" lv.");
    }
}
