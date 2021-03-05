package com.company;
import java.util.Scanner;

public class ZadaniePiate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Dni = scan.nextInt();

        switch(Dni) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;

            default:
                System.out.println("Nie istnieje taki dzień tygodnia.");
        }
    }
}
