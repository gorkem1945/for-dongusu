package com.arslaner.karar;

import java.util.Random;

public class DonguFor2 {
    Random random = new Random();

    public void fordenıyoruz() {
        int sayac5 = 0;
        int sayac7 = 0;


        for (int a = 1; a <= 100; a++) {
            if (a % 5 == 0) {
                sayac5 = sayac5 + 1;
            }
            if (a % 7 == 0) {
                sayac7 = sayac7 + 1;
            }
        }

        System.out.println("1/100 arasında " + sayac5 + " tane sayı 5'e bölünür.");
        System.out.println("1/100 arasında " + sayac7 + " tane sayı 7'ye bölünür.");
    }

    public void sayiUret() {
        int usayi = random.nextInt(16);
        System.out.println(usayi);
    }

    public void sayiUret2() {
        for (int x = 1; x <= 100; x++) {
            System.out.println(x+ "10 ile yüz arasındır ");
        }

    }

}

