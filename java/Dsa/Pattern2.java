package Dsa;

import java.util.Scanner;

public class Pattern2 {

    static void reverseButterfly(int n) {

    }

    static void reverseAlphabetTriangle(int n) {
        for (int i = n; i > 0; i--) {
            char ch1 = 'A';
            ch1 += i - 1;
            for (char ch = ch1; ch <= 'A' + n - 1; ch++) {
                System.out.printf("%2s", ch);
            }
            System.out.println();
        }
    }

    static void alphabetPyramid(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n - i; j++) {
                System.out.printf("%2s", " ");
            }
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.printf("%-2s", ch);
            }
            char ch1 = 'A';
            ch1 += i - 1;
            for (char ch = ch1; ch >= 'A'; ch--) {
                System.out.printf("%-2s", ch);
            }
            System.out.println();
        }
    }

    static void square(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.printf("%2s", "*");
                }
                if (j == 1 || j == n) {
                    System.out.printf("%2s", "*");
                } else {
                    System.out.printf("%2s", "");
                }
            }
        }
    }

    static void butterflyPattern(int n) {
        int space = n - 2;
        int line = 0;
        if (n % 2 == 0) {
            line = n / 2 - 1;

        } else {
            line = n / 2;

        }
        int s = 0;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%2s", "*");
            }
            s = space;
            for (int k = s; k > 0; k--) {
                System.out.printf("%2s", " ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.printf("%2s", "*");
            }
            space -= 2;
            System.out.println();
        }
        space += 2;

        for (int j = 1; j <= n; j++) {
            System.out.printf("%2s", "*");
        }
        System.out.println();
        for (int k = line; k > 0; k--) {
            for (int i = 1; i <= k; i++) {
                System.out.printf("%2s", "*");
            }
            s = space;
            for (int j = 1; j <= s; j++) {
                System.out.printf("%2s", " ");
            }
            for (int l = 1; l <= k; l++) {
                System.out.printf("%2s", "*");
            }
            System.out.println();
            space += 2;
        }
    }

    static void alphabet(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            ch += i;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-2s", ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter numbers:\t");
        int n = sc.nextInt();
        // alphabet(n);
        butterflyPattern(n);
        // alphabetPyramid(n);
        // square(n);
        // reverseAlphabetTriangle(n);

    }

}
