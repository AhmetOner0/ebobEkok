package patikadev;

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n1, n2, ebob = 1, ekok = 1;
        System.out.println("sayı bir:");
        n1 = inp.nextInt();
        System.out.println("sayı iki");
        n2 = inp.nextInt();
        if (n1 >= n2) {
            for (int i = 1; i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }

            }
            for (int i = n1; ; i++) {
                if (i % n1 == 0 && i % n2 == 0) {
                    ekok = i;
                    System.out.println("ekok:" + ekok);
                    break;
                }
            }
        } else {
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }

            for (int i = n2; ; i++) {
                if (i % n1 == 0 && i % n2 == 0) {
                    ekok = i;
                    System.out.println("ekok:" + ekok);
                    break;
                }
            } 

        }
        System.out.println("ebob:" + ebob);

    }
}
