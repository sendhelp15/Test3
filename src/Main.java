import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Wprowadź liczbę");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int silnia = 1;
        for (int i = 1; i <= x; i++){
            silnia = silnia * i;
        }
        System.out.println("Silnia wynosi: " + silnia);

    }
}