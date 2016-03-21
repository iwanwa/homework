import java.util.Scanner;

/**
 * Created by Iwan on 3/20/2016.
 */
public class SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number.");
        int num = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=num;i++) {
            sum +=i;
        }
        System.out.printf("The Sum between 1 and %d is %d.%n", num,sum);
    }
}
edit