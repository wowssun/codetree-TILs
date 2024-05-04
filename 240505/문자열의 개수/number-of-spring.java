import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        String [] arr = new String[100];
        int i = 0;

        while (true) {
            String str = sc.next();
    
            if (str.equals("0")) {
                System.out.println(cnt);
                break;
            }

            cnt++;

            if (cnt % 2 == 1) {
                arr[i] = str;
                i++;
            }
        }

        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }

    }
}