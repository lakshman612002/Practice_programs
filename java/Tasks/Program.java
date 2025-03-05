import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static void reverse(int n) {

        while (n > 0) {
            System.out.print(n % 10 + "\t");
            n = n / 10;
        }
    }

    static int factorial(int n) {
        int i = 1;
        var fact = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        // System.out.println("factorial of " + n + " is:" + factorial);
        return fact;
    }

    static void primeRange(int n) {

        for (int i = 2; i <= n; i++) {
            int flag = 1;
            int j = i;
            int k = 2;
            while (k <= j / 2) {

                if (j % k == 0) {
                    flag = 0;
                    break;
                } else {
                    k++;
                }
            }
            if (flag == 1) {
                System.out.println(i + "\t");
            }
        }
    }

    static void prime(int n) {
        int i = 2;
        int flag = 1;
        while (i <= n / 2) {

            if (n % i == 0) {
                System.out.println("Not prime");
                flag = 0;
                break;
            } else {
                i++;
            }
        }
        if (flag == 1) {
            System.out.println("prime number");
        }
    }

    static void strongNumber(int n) {
        int k = n;
        int sum = 0;
        while (n > 0) {
            sum += factorial(n % 10);
            n /= 10;
        }
        if (k == sum) {
            System.out.println("strong number");
        } else {
            System.out.println("not strong number");
        }
    }

    static void perfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("perfect number");
        } else {
            System.out.println("not perfect number");
        }
    }

    static int digitCount(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static void armstrongNumber(int n) {
        int count = digitCount(n);
        int k = n;
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, count);
            n /= 10;
        }
        if (k == sum) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not armstrong number");
        }
    }

    static void nthFibnachi(int n) {
        int pre = 1;
        int next = 1;
        int nthFibnachi = 0;
        if (n == 1 || n == 2) {
            System.out.println("1");
        } else {
            for (int i = 3; i <= n; i++) {
                nthFibnachi = pre + next;
                pre = next;
                next = nthFibnachi;
            }
            System.out.println(n + " fibnachi is:\t" + nthFibnachi);
        }
    }

    static void sequenceDigits(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }
    }

    static void patternOfX(int n) {
        int count = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == count) {
                    System.out.printf("%2s", "*");
                } else if (i == j) {
                    System.out.printf("%2s", "*");
                } else {
                    System.out.printf("%2s", " ");
                }
            }
            System.out.println();
            count--;
        }
    }

    static void patternOfTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.printf("%s", " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-2s", "*");
            }
            System.out.println();
        }
    }

    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-2d X %-2d = %-2d", i, n, i * n);
            System.out.println();
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

    // static void squarePattern(int n){
    // for(in)
    // }

    public static void main(String[] args) throws Exception {
        System.out.print("enter a number:\t");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // factorial(n);
        // prime(n);
        // reverse(n);
        // primeRange(n);
        // strongNumber(n);
        // perfectNumber(n);
        // armstrongNumber(n);
        // nthFibnachi(n);
        // sequenceDigits(n);
        // patternOfX(n);
        // patternOfTriangle(n);
        // table(n);
        // butterflyPattern(n);

    }

}
