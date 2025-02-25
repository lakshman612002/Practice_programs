import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Resturant {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var bill = 0;
        boolean order = true;
        while (order) {
            System.out.println("||Potta Penchudam Resturant||| ");
            System.out.println("Menu");
            System.out.println("1.Vegetarian");
            System.out.println("2.Non-vegetarian");
            System.out.print("Choose type of Food you want by entering options given above:\t");
            int opt = Integer.parseInt(br.readLine());
            switch (opt) {
                case 1 -> {

                    System.out.println("Items available in veg:");
                    System.out.println("1.Full meals");
                    System.out.println("2.chapati");
                    System.out.println("3.Idly");
                    System.out.println("4.upmaa");
                    System.out.println("5.puri");
                    System.out.print("Choose your food in veg:\t");
                    int item = Integer.parseInt(br.readLine());
                    switch (item) {
                        case 1 -> {
                            System.out.println("Full meals one plate price is 100/-");
                            System.out.print("enter how many plates you want:\t");
                            int plates = Integer.parseInt(br.readLine());
                            bill += 100 * plates;
                        }
                        case 2 -> {
                            System.out.println("chapati one plate price is 50/-");
                            System.out.print("enter how many plates you want:\t");
                            int plates = Integer.parseInt(br.readLine());
                            bill += 50 * plates;
                        }
                        case 3 -> {
                            System.out.println("idly one plate price is 30/-");
                            System.out.print("enter how many plates you want:\t");
                            int plates = Integer.parseInt(br.readLine());
                            bill += 30 * plates;
                        }
                        case 4 -> {
                            System.out.println("upmaa one plate price is 40/-");
                            System.out.print("enter how many plates you want:\t");
                            int plates = Integer.parseInt(br.readLine());
                            bill += 40 * plates;
                        }
                        case 5 -> {
                            System.out.println("puri one plate price is 45/-");
                            System.out.print("enter how many plates you want:\t");
                            int plates = Integer.parseInt(br.readLine());
                            bill += 45 * plates;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Items available in Non-veg:");
                    System.out.println("1.Biriyani");
                    System.out.println("2.Chicken Rice");
                    System.out.println("3.Roast");
                    System.out.println("4.Mutton Curry");
                    System.out.print("Choose your food in Non-veg:\t");
                    int item = Integer.parseInt(br.readLine());
                    switch (item) {
                        case 1 -> {
                            System.out.println("Biriyani one plate price is 150/-");
                            System.out.print("enter how many plates you want:\t");
                            int plates = Integer.parseInt(br.readLine());
                            bill += 150 * plates;
                        }
                        case 2 -> {
                            System.out.println("Chicken Rice one plate price is 100/-");
                            System.out.print("enter how many plates you want:\t");
                            int plates = Integer.parseInt(br.readLine());
                            bill += 100 * plates;
                        }
                        case 3 -> {
                            System.out.println("Roast one plate price is 200/-");
                            System.out.print("enter how many plates you want:\t");
                            int plates = Integer.parseInt(br.readLine());
                            bill += 200 * plates;
                        }
                        case 4 -> {
                            System.out.println("Mutton Curry one plate price is 440/-");
                            System.out.print("enter how many plates you want:\t");
                            int plates = Integer.parseInt(br.readLine());
                            bill += 440 * plates;
                        }
                    }
                }
            }
            System.out.println("do you want order anymore else !!!");
            System.out.println("1.yes");
            System.out.println("2.No");
            System.out.print("choose your opninon:\t");
            int opninon = Integer.parseInt(br.readLine());
            if (opninon == 1)
                order = true;
            else
                order = false;
        }
        var gst = bill * .10;
        bill += gst;
        System.out.println("thank you visting our restuarant,your total bills is:" + bill);
    }
}
