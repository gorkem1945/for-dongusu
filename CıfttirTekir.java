package com.arslaner.karar;

import java.util.Random;

public class CıfttirTekir {

    Random random = new Random();

    public void cfttk() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Çifttir");

            } else {
                System.out.println(i + " Tektir");
            }
        }
    }
}
