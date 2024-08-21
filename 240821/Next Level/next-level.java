import java.util.Scanner;

class UserInfo {
    String id;
    int level;

    public UserInfo() {
        this.id = "codetree";
        this.level = 10;
    }

    public UserInfo(String id, int level) {
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userId = sc.next();
        int userLevel = sc.nextInt();

        UserInfo user1 = new UserInfo();
        UserInfo user2 = new UserInfo(userId, userLevel);

        System.out.println("user " + user1.id + " lv " + user1.level);
        System.out.println("user " + user2.id + " lv " + user2.level);
        
    }
}