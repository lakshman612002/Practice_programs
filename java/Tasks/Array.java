import java.util.Scanner;

public class Array {

    static void missingElement(int[] arr) {
        int n = arr.length;
        int sum = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
        }
        System.out.println(sum);

    }

    static void matrixMultiplication() {
        System.out.println("First array");
        int[][] arr1 = twoDimensionalArray();
        System.out.println("Second array:");
        int[][] arr2 = twoDimensionalArray();

        int[][] mul = new int[arr1.length][arr2[0].length];
        if (arr1[0].length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2[0].length; j++) {
                    for (int k = 0; k < arr1[0].length; k++) {
                        mul[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        } else {
            System.out.println("matric multiplication is not possible");
            return;
        }
        System.out.println("matrix multiplication :");
        for (int[] sda : mul) {
            for (int ele : sda) {
                System.out.print(ele + "\t");
            }
            System.out.println();
        }
    }

    static void jaggedArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size:\t");
        int row = sc.nextInt();
        int[][] arr = new int[row][];
        for (int i = 0; i < row; i++) {
            System.out.print("enter column size for " + (i + 1) + " row:");
            int col = sc.nextInt();
            arr[i] = new int[col];
            System.out.println("enter the elements for " + (i + 1) + " row:");
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("elements in the array:");
        for (int[] sda : arr) {
            for (int ele : sda) {
                System.out.print(ele + "\t");
            }
            System.out.println();
        }

    }

    static void matrixAddition() {
        System.out.println("First array:");
        int[][] arr1 = twoDimensionalArray();
        System.out.println("second array:");
        int[][] arr2 = twoDimensionalArray();
        int[][] add = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                add[i][j] += arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Addition of two arrays:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] twoDimensionalArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size:\t");
        int row = sc.nextInt();
        System.out.print("enter the column size:\t");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            System.out.println("enter the elements for " + i + "\'th row:");
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
        // System.out.println("elements in the array:\t");
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < column; j++) {
        // System.out.print(arr[i][j] + "\t");
        // }
        // System.out.println();
        // }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter array size:\t");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.print("Enter elements in array:\t");
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // missingElement(arr);
        // twoDimensionalArray();
        matrixAddition();
        // jaggedArray();
        matrixMultiplication();
    }
}
