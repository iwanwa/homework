import java.util.Scanner;

/**
 * Created by Iwan on 3/20/2016.
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number.");
        String str = sc.next();
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "0":
                    System.out.print("Gee");
                    break;
                case "1":
                    System.out.print("Bro");
                    break;
                case "2":
                    System.out.print("Zuz");
                    break;
                case "3":
                    System.out.print("Ma");
                    break;
                case "4":
                    System.out.print("Duh");
                    break;
                case "5":
                    System.out.print("Yo");
                    break;
                case "6":
                    System.out.print("Dis");
                    break;
                case "7":
                    System.out.print("Hood");
                    break;
                case "8":
                    System.out.print("Jam");
                    break;
                case "9":
                    System.out.print("Mack");
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
        System.out.println();
    }
}