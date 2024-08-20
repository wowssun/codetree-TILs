import java.util.Scanner;

class Secret {
    String code, spot;
    int time;

    public Secret(String code, String spot, int time){
        this.code = code;
        this.spot = spot;
        this.time = time;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String spot = sc.next();
        int time = sc.nextInt();

        Secret agent = new Secret(code, spot, time);

        System.out.println("secret code : " + agent.code);
        System.out.println("meeting point : " + agent.spot);
        System.out.println("time : " + agent.time);
    }
}