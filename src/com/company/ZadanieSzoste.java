package com.company;
import java.util.Scanner;

public class ZadanieSzoste {

    public static void main(String[] args)
    {
        System.out.println("Wpisz 3 wybrane liczby.");

        Scanner scan = new Scanner(System.in);
        double Liczba1 = scan.nextInt();
        double Liczba2 = scan.nextInt();
        double Liczba3 = scan.nextInt();

        System.out.println ("Ustalam kolejność");

        if ((Liczba3 > Liczba1) && (Liczba3 > Liczba2) && (Liczba1 > Liczba2)) {
            System.out.println(Liczba3);

            System.out.println(Liczba1);

            System.out.println(Liczba2);
        }
        else if ((Liczba2 > Liczba1) && (Liczba2 > Liczba3) && (Liczba1 > Liczba3)) {
            System.out.println(Liczba2);

            System.out.println(Liczba1);

            System.out.println(Liczba3);
        }
        else if ((Liczba1 > Liczba2) && (Liczba1 > Liczba3) && (Liczba2 > Liczba3)) {
            System.out.println(Liczba1);

            System.out.println(Liczba2);

            System.out.println(Liczba3);
        }
        else if ((Liczba1 > Liczba2) && (Liczba1 > Liczba3) && (Liczba3 > Liczba2)) {
            System.out.println(Liczba1);

            System.out.println(Liczba3);

            System.out.println(Liczba2);
        }
        else if ((Liczba3 > Liczba1) && (Liczba3 > Liczba2) && (Liczba2 > Liczba1)) {
            System.out.println(Liczba3);

            System.out.println(Liczba2);

            System.out.println(Liczba1);
        }
        else if ((Liczba2 > Liczba1) && (Liczba2 > Liczba3) && (Liczba3 > Liczba1)) {
            System.out.println(Liczba2);

            System.out.println(Liczba3);

            System.out.println(Liczba1);
        }
        else {
            System.out.println("Nie potrafię ułożyć w kolejności podanych liczb.");
        }

    }
}
