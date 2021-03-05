package com.company;
import java.util.Scanner;

import static java.lang.Math.*;

public class ZadanieSiodme {

    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);

     double coord_x1, coord_x2, coord_y1, coord_y2;

     System.out.println("Podaj współrzędne:");

     coord_x1 = scan.nextInt();

     coord_y1 = scan.nextInt();

     coord_x2 = scan.nextInt();

     coord_y2 = scan.nextInt();

     System.out.println("Odległość między punktami wynosi " + sqrt((Math.pow(coord_x2-coord_x1, 2))+ (Math.pow(coord_y2-coord_y1, 2))));
    }
}
