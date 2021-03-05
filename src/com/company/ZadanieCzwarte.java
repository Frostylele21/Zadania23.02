package com.company;
import java.util.Scanner;

public class ZadanieCzwarte {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszy bok");
        double Bok1 = scanner.nextInt();

        System.out.println("Podaj drugi bok");
        double Bok2 = scanner.nextInt();

        System.out.println("Podaj trzeci bok");
        double Bok3 = scanner.nextInt();

        if (Bok1 + Bok2 > Bok3){
            System.out.println("Te boki utworzą trójkąt.");
        } else {
            System.out.println("Te boki nie utworzą trójkąta.");
        }
    }
}

