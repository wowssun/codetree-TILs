import java.util.*;

class User implements Comparable<User> {
    String name;
    int height;
    int weight;

    public User(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(User user) {
        if (this.height != user.height) {
            return this.height - user.height;
        }
        return user.weight - this.weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        User [] us = new User[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            us[i] = new User(name, height, weight);
        }

        Arrays.sort(us);

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %d %d\n", us[i].name, us[i].height, us[i].weight);
        }
    }
}