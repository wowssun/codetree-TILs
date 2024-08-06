import java.util.Scanner;

public class Main {

    public static boolean twiceAlphabet(String str) {
        // 하나라도 서로 다른 알파벳이 있으면 2개이상 
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) != str.charAt(0))
                return true;
    
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (twiceAlphabet(str)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}