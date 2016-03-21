import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Iwan on 3/20/2016.
 */
public class GetAverage {
    public static void main(String[] args) {
        new DecimalFormat("#.#", new DecimalFormatSymbols(Locale.US));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers.");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc. nextDouble();
        double average = average(a,b,c);
        System.out.printf("%.2f",average);
    }
    public static double average(double a, double b, double c) {
        double average = (a+b+c)/3;
        return average;
        skjbd;bn
        fvbkdjfbnd
        fbqndfb;n
    }
}
