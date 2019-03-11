import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kąt w stopniach");
        double x = scanner.nextDouble();
        System.out.println("Podaj liczbe elementow szeregu");
        int dlugoscSzeregu = scanner.nextInt();

        System.out.println("Wynik Math.sin() = " + Math.sin(Math.toRadians(x)));
        System.out.println("Wynik własnej implementacji = " + obliczSin(x,dlugoscSzeregu));
        System.out.println("Klaudia");

    }

    public static double obliczSin(double x, int dlugoscSzeregu){
        x = Math.toRadians(x);
        double wynik = 0;

        for(int i=0 ; i<dlugoscSzeregu ; i++){

            if(i%4 == 0){
                wynik += 0;
            }
            else if(i%4 == 1){
                wynik += (Math.pow(x,i))/silnia(i);
            }
            else if(i%4 == 2){
                wynik -= 0;
            }
            else if(i%4 == 3){
                wynik -= (Math.pow(x,i))/silnia(i);
            }

        }
        return wynik;
    }

    public static int silnia(int x)
    {
        if (x == 0)
            return 1;
        else
            return x * silnia(x - 1);
    }


}
