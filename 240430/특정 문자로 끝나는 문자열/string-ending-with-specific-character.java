import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextLine();
        }

        char str = sc.nextLine().charAt(0);

        for (int i = 0; i < 10; i++) {
            int len = arr[i].length();

            if (str == arr[i].charAt(len-1)) {
                System.out.println(arr[i]);
            }
        }
    }
}