import java.util.Scanner;

class Bomb {
    String code;
    String color;
    int time;

    public Bomb(String code, String color, int time) {
        this.code = code;
        this.color = color;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputCode = sc.next();
        String inputColor = sc.next();
        int inputTime = sc.nextInt();

        Bomb boom = new Bomb(inputCode, inputColor, inputTime);
        System.out.println("code : " + boom.code);
        System.out.println("color : " + boom.color);
        System.out.println("second : " + boom.time);

    }
}