package Dsa;

import java.util.Scanner;

public class Pattern {

    static void inverseAlphabetsTriangle(int n) {
        for (int i = n; i > 0; i--) {
            char ch = 'A';
            ch += i;
            for (char ch1 = 'A'; ch1 < ch; ch1++) {
                System.out.printf("%-2s", ch1);
            }
            System.out.println();
        }
    }

    static void alphabetsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.printf("%-2s", ch);
            }
            System.out.println();
        }
    }

    static void sequenceNumber(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-3d", count);
                count++;
            }
            System.out.println();
        }
    }

    static void crownPatternNumber(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-2s", count);
                count++;
            }
            for (int k = 1; k <= spaces; k++) {
                System.out.printf("%2s", " ");
            }
            count--;
            for (int l = 1; l <= i; l++) {
                System.out.printf("%2s", count);
                count--;
            }
            System.out.println();
            spaces -= 2;

        }
    }

    static void binaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int start;
            if (i % 2 == 1) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%2s", start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void upDown(int n) {
        for (int i = 1; i < n * 2; i++) {
            int stars = i;
            if (i > n) {
                stars = n * 2 - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
    }

    static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.printf("%s", " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-2s", "*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.printf("%s", " ");
            }
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.printf("%-2s", "*");
            }

            System.out.println();
        }

    }

    static void invertedEquilateralTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.printf("%s", " ");
            }
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.printf("%2s", "*");
            }

            System.out.println();
        }
    }

    static void equilateralTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.printf("%s", " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-2s", "*");
            }
            System.out.println();
        }
    }

    static void invertedRightAngleTriangel(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n + 1 - i; j++) {
                System.out.printf("%2s", "*");
            }
            System.out.println();
        }
    }

    static void invertedRightAngleTriangelNumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n + 1 - i; j++) {
                System.out.printf("%2s", j);
            }
            System.out.println();
        }
    }

    static void numberRightAngleTriangleSame(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%2s", i);
            }
            System.out.println();
        }
    }

    static void numberRightAngleTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%2s", j);
            }
            System.out.println();
        }

    }

    static void rightAngleTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%2s", "*");
            }
            System.out.println();
        }

    }

    static void blockPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%2s", "*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter numbers:\t");
        int n = sc.nextInt();
        sc.close();
        // blockPattern(n);
        // rightAngleTriangle(n);
        // numberRightAngleTriangle(n);
        // numberRightAngleTriangleSame(n);
        // invertedRightAngleTriangelNumber(n);
        // invertedRightAngleTriangel(n);
        // equilateralTriangle(n);
        // invertedEquilateralTriangle(n);
        diamond(n);
        // upDown(n);
        // binaryTriangle(n);
        // crownPatternNumber(n);
        // sequenceNumber(n);
        // alphabetsTriangle(n);
        // inverseAlphabetsTriangle(n);

    }
}
