import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int height = sc.nextInt();

        width += 8;
        height *= 3;

        int area = width * height;

        System.out.println(width);
        System.out.println(height);
        System.out.println(area);
    }
}