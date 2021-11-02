import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secMetar = Double.parseDouble(scanner.nextLine());

        double swims = distance * secMetar;
        double delay = Math.floor(distance / 15)*12.5;
        double totalTime = swims + delay;

        if (totalTime >= record) {
            totalTime=totalTime- record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime);

        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
