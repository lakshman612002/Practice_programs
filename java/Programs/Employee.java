import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter employ no.:\t");
        int eno = sc.nextInt();

        System.out.print("enter employ name:\t");
        String st = sc.nextLine();
        sc.skip(st);
        String ename = sc.nextLine();
        System.out.print("enter emplou salary:\t");
        float salary = sc.nextFloat();
        System.out.println(eno);
        System.out.println(ename);
        System.out.println(salary);
    }
}
