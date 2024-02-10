package com.arslaner.karar;

import java.util.Random;
import java.util.Scanner;

public class Oyun {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

    public void denemeoyun() {
        int sayac = 0;

        System.out.println("Bir sayı giriniz");
        int tahmin = sc.nextInt();
        while (tahmin > 100 || tahmin < 50) {
            System.out.println("Girdiğiniz sayı 100'den büyük veya 50'den küçüktür,tekrar deneyiniz.");
            tahmin = sc.nextInt();
        }

        for (int a = 1; a <= 15; a++) {
            int usayi = rd.nextInt(51) + 50;
            if (tahmin == usayi) {
                sayac = sayac + 1;
            }
        }

       //sayacaın en az 0 en cok 15 >=3
       if (sayac>=3){
           System.out.println("tebrikler oyunu kazandınız.");
       }else {
           System.out.println("Oyunu kaybettiniz.");
           System.out.println(sayac);
       }

    }
}
