package com.arslaner.karar;

import java.util.Random;
import java.util.Scanner;

public class Rsayi {

    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    public void sayi() {
        System.out.println("Sayınızı giriniz.");
        int tahmin = sc.nextInt();
        while (tahmin > 20 || tahmin < 1) {
            System.out.println("Girdiğiniz sayı 20 den büyük veya 1 den küçüktür,tekrar deneyin");
            tahmin = sc.nextInt();
        }

        for (int a = 1; a <= 5; a++) {
            int gsayi = random.nextInt(21) + 1;
            //  System.out.println(gsayi + " " + tahmin);
            if (tahmin == gsayi) {
                System.out.println("Oyunu kazandın");
                return;  //metodu sonlandırır
            }

        }
        System.out.println("Oyunu kaybettin");


    }
}
