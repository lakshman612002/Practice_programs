import java.util.Scanner;

public class CharacterIdentification {
    public static void main(String[] args) throws Exception {
        int ch = System.in.read();
        // System.out.println(ch);
        if (ch >= '0' && ch <= '9') {
            System.out.println("given character is digit");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("given character is vowel");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch <= 'z' && ch >= 'a')) {
            System.out.println("given character is consonant");
        } else {
            System.out.println("given character is special character");
        }
    }
}
