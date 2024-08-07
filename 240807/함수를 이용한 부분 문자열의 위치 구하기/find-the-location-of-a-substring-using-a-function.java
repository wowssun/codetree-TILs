import java.util.Scanner;

public class Main {
    public static String input;
    public static String goal;

    public static int existPart() {
        int inLen = input.length();
        int goLen = goal.length();
        for (int i = 0; i <= inLen - goLen; i++) {
            int cnt = 0;
            for (int j = 0; j < goLen; j++) {
                if (input.charAt(i+j) == goal.charAt(j)) {
                    cnt++;
                }

                if (cnt == goLen) {
                    return i;
                }
            }    
        }

        return -1;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        input = sc.next();
        goal = sc.next();

        int result = existPart();     
        System.out.print(result);
    }
}