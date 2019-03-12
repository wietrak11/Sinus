import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz czy chcesz podać kąd w:");
        System.out.println("1.Stopniach");
        System.out.println("2.Radianach");
        int wybor = scanner.nextInt();
        System.out.println("Podaj wartosc");
        double x = scanner.nextDouble();
        System.out.println("Podaj liczbe elementow szeregu");
        int dlugoscSzeregu = scanner.nextInt();

        if(wybor==1){
            System.out.println("Wynik Math.sin() = " + Math.sin(Math.toRadians(x)));
            System.out.println("Wynik własnej implementacji = " + obliczSin(Math.toRadians(x),dlugoscSzeregu));
        }else if(wybor==2){
            System.out.println("Wynik Math.sin() = " + Math.sin(x));
            System.out.println("Wynik własnej implementacji = " + obliczSin(x,dlugoscSzeregu));
        }
    }

    public static double obliczSin(double x, int dlugoscSzeregu){
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
