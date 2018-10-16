package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public int SumaCifara(int i) {
        int suma;
        for (suma = 0; i != 0; i /= 10) {
            suma += i%10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        Main main = new Main();

        for (int i = 1; i <= n; ++i) {
            if (i % main.SumaCifara(i) == 0) {
                System.out.println(i);
            }
        }
    }
}
