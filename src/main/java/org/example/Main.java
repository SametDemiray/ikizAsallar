package org.example;
/*
Klavyeden girilen bir üst sınıra kadar olan ikiz asal sayıları listeleyen bir Java programı
Üst sınırı girin: 20
Ikiz asal sayılar:
(3, 5)
(5, 7)
(11, 13)
(17, 19)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ustSinir;
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üst sınırı girin: ");
        ustSinir = scanner.nextInt();

        System.out.println("Ikiz asal sayılar:");
        for (i = 2; i <= ustSinir - 2; i++) {
            if (isAsal(i) && isAsal(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    // Bir sayının asal olup olmadığını kontrol eden metot
    public static boolean isAsal(int sayi) {

        int i;

        if (sayi <= 1) {
            return false;
        }
        for (i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

}