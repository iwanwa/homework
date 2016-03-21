/**
 * Created by Iwan on 3/20/2016.
 */
public class PrintCharacters {
    public static void main(String[] args) {
        for (char ch = 'a'; ; ch++) {
            System.out.print(ch + " ");
            if (ch=='z') {
                break;
            }
        }
    }
}
