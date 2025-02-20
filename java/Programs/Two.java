import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Two {

    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("enter a value:\t");
        int a = Integer.parseInt(br.readLine());
        System.out.print("enter b value:\t");
        int b = Integer.parseInt(br.readLine());
        System.out.print("enter c value:\t");
        int c = Integer.parseInt(br.readLine());
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);

        if (a > b && a > c) {
            if (b == c) {
                System.out.println("a is greater than b,c and b,c are equal");
            } else {
                System.out.println("a is greater than b and c");
            }
        } else if (b > c && b > a) {
            if (c == a) {
                System.out.println("b is greater than c,a and c,a are equal");
            } else {
                System.out.println("b is greater than a and c");
            }
        } else if (c > a && c > b) {
            if (b == a) {
                System.out.println("c is greater than a,b and a,b are equal");
            } else {
                System.out.println("c is greater than a and b");
            }
        } else if (a == b) {
            if (a > c) {
                System.out.println("a and b are equal and also greater than c");
            } else if (a < c) {
                System.out.println("c is greater than a,c and a,c are equal");
            }
        } else if (a == c) {
            if (a > b) {
                System.out.println("a,c are equal and greater than b");
            } else if (a < b) {
                System.out.println("b is greater than a,c and a,c are equal");
            }
        } else if (b == c) {
            if (b > a) {
                System.out.println("b and c are equal and greater than a");
            } else if (b < a) {
                System.out.println("a is greater than b,c and b,c are equal");
            }
        } else {
            System.out.println("a,b and c are equal");
        }
    }

}
