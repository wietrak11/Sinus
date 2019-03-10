import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kąt w stopniach");
        double x = scanner.nextDouble();
        System.out.println("Wynik Math.sin() gdzie podana liczba została zamieniona na radiany = " + Math.sin(Math.toRadians(x)));
        System.out.println("Wynik Math.sin() bez zamiany na radiany = " + Math.sin(x));

    }
}
