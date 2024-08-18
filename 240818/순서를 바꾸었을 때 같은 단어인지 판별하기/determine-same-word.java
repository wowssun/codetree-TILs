import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        char [] char1 = str1.toCharArray();
        char [] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        String sortedStr1 = new String(char1);
        String sortedStr2 = new String(char2);

        if (sortedStr1.equals(sortedStr2)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}