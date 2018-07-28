package com.pawelozga;

public class Main {

    public static void main(String[] args) {
        //zadanie 1
//        for (int j = 0; j < 10; j++) {
//            System.out.println();
//            for (int i = 0; i < 10; i++) {
//                System.out.print("x");
//            }
//        }
// zadanie 2 i 3
//        for (int i = 0; i < 10; i++) {
//            if (i == 0 || i == 9) {
//                for (int j = 0; j < 10; j++) {
//                    System.out.print("X ");
//                }
//                System.out.println();
//            } else {
//                for (int k = 0; k < 10; k++) {
//                    if (k == 0 || k == 9) {
//                        System.out.print("X ");
//                    } else {
//                        System.out.print("  ");
//                    }
//                }
//                System.out.println();
//            }
//        }

        //zadanie 4
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("X ");
//            }
//            System.out.println();
//        }
//zad5
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 11; j++) {
                if (j < 11 / 2 + i && j > 11 / 2 - i) {
                    System.out.print(" X");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

}






