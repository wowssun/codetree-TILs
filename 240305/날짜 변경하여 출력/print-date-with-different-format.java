import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("\\.");  // 정규 표현식으로 . 를 표현

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        System.out.printf("%d-%d-%d", month, day, year);
    }
}