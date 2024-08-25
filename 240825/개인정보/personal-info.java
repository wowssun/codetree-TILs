import java.util.*;

class User implements Comparable<User>{
    String name;
    int height;
    double weight;

    public User(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(User user) {
        return this.name.compareTo(user.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User [] us = new User[5];

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            us[i] = new User(name, height, weight);
        }

        // 이름 오름차순 정렬
        Arrays.sort(us);
        System.out.println("name");
        for (int i = 0; i < 5; i++){
            System.out.printf("%s %d %.1f\n", us[i].name, us[i].height, us[i].weight);
        }
        System.out.println();
        // 키 내림차순 정렬 
        Arrays.sort(us, (a, b) -> b.height - a.height); 

        System.out.println("height");
        for (int i = 0; i < 5; i++){
            System.out.printf("%s %d %.1f\n", us[i].name, us[i].height, us[i].weight);
        }
    }
}