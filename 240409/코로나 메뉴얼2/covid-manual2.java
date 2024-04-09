import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] result = new int[5];

        int grade = 0;

        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            int d = sc.nextInt();

            if (t.equals("Y") && d >= 37) {
                grade = 1;
            } else if (d >= 37) {
                grade = 2;
            } else if (t.equals("Y")) {
                grade = 3;
            } else {
                grade = 4;
            }

            result[grade]++;
        }

        for (int i = 1; i < 5; i++) {
            System.out.print(result[i] + " ");
        }

        if (result[1] >= 2) {
            System.out.print("E");
        }
    }
}