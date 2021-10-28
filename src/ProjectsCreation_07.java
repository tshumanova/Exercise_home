import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String firstName = Scanner.nextLine();
        int age = Integer.parseInt(Scanner.nextLine());

        int hour =3*age;
        System.out.println("The architect " + firstName+" " + "will need " + hour+" hours" +" to complete " + age+" project/s.");
    } //Test
}
