import java.util.*;

class Human implements Comparable<Human>{
    String name;
    int height;
    int weight;

    public Human(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Human human) {
        return this.height - human.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Human [] people = new Human[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            people[i] = new Human(name, height, weight);
        }

        Arrays.sort(people);

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %d %d\n", people[i].name, people[i].height, people[i].weight);
        }
    }
}