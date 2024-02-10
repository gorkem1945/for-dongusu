package com.arslaner.karar;

public class İcİceForDongusu {

    public void ıcIceDongu() {

        for (int a = 1; a <= 4; a++) {
            System.out.println("Ali " + a);
            for (int x = 1; x <= 3; x++) {
                System.out.println("Veli " + x + " " + a);
            }
            System.out.println("Hasan " + a);
            System.out.println("------------------");
        }
        System.out.println("Bitti");
    }

    public void dongu() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i);
            }
            System.out.println("-----------------");
        }
    }

    public void dongusu() {
        for (int a = 1; a <= 3; a++) {
            for (int x = 1; x <= 5; x++) {
                System.out.println(x);
            }
            System.out.println("-------------------");
        }
    }

    public void soru() {
        for (int a = 5; a >= 1; a--) {
            for (int x = 1; x <= 4; x++) {
                System.out.println(a);
            }
            System.out.println("-------------------");
        }
    }

    public void soru1() {
        for (int a = 5; a >= 1; a--) {
            for (int x = 1; x <= a; x++) {
                System.out.println(a);
            }
            System.out.println("-------------------");
        }
    }

    public void soru2() {
        for (int a = 1; a <= 4; a++) {
            for (int x = 1; x <= a; x++) {
                System.out.println(a);
            }
            System.out.println("-------------------");
        }
    }

    public void soru3() {

        for (int a = 2; a <= 4; a++) {
            for (int x = 1; x <= 4; x++) {
                System.out.println(a*x);
            }
            System.out.println("-------------------");
        }
    }

}
