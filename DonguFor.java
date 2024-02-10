package com.arslaner.karar;

public class DonguFor {

    public void for1() {
        for (int x = 10; x >= 1; x--) {
            System.out.println("Manisa " + x);
        }

    }

    public void for2() {
        // 1 ile 10 arasındaki sayıların toplamını bulan method
        int toplam = 0;
        for (int x = 1; x <= 152; x++) {
            toplam = toplam + x;
        }

        System.out.println("Sayıların toplamı= " + toplam);
    }

    public void for3() {
        for(int a= 1; a<=100; a++){
            if(a%2==0){
                System.out.println(a+" çiftir.");
            }else{
                System.out.println(a+" tektir.");
            }
        }
    }
}