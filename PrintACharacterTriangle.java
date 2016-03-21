import java.util.Scanner;

/**
 * Created by Iwan on 3/20/2016.
 */
public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 and 26.");
        int num = sc.nextInt();
        int temp = num;
        char ch = 'a';
        int [][] matrix = new int[(2*num)-1][num];
        for (int i = 0; i<num; i++) {
            for (int j =0,k=0+i; j<(2*temp)-1;j++,k++) {
                matrix[k][i]=ch;
            }
            temp--;
            ch++;
        }
        for (int i = 0 ; i<(2*num)-1;i++) {
            for (int j= 0; j<num;j++) {
                System.out.print((char) matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}
