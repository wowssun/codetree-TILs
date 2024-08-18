import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arrOne = new int[n];
        int [] arrTwo = new int[n];

        for (int i = 0; i < n; i++) {
            arrOne[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arrTwo[i] = sc.nextInt();
        }

        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);
        boolean result = true;

        for (int i = 0; i < n; i++) {
            if (arrOne[i] != arrTwo[i]) {
                result = false;
            }
        }

        if (result) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}