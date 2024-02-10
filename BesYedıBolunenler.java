package com.arslaner.karar;

public class BesYedıBolunenler {

    public void bolunenler() {

        int sayac5 = 0;
        int sayac7 = 0;

        for (int x = 1; x <= 100; x++) {

            if (x % 5 == 0) {
                sayac5 = sayac5 + 1;
            }
            if (x % 7 == 0) {
                sayac7 = sayac7 + 1;
            }
        }
        System.out.println("1/100 " + sayac5 + " tane sayı 5'e bölünür.");
        System.out.println("1/100 " + sayac7 + " tane sayı 7'ye bölünür.");
    }
}

