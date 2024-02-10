package com.arslaner.karar;

import java.util.Random;

public class Rtoplama {
    Random rd = new Random();

    public void rtoplam() {

        int toplam = 0;
        for (int x = 1; x <= 4; x++) {
            int sayi=rd.nextInt(6)+5;
            toplam = toplam + sayi;
            //System.out.println(sayi);

        }
        System.out.println(toplam);

    }
}