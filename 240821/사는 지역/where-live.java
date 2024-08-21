import java.util.Scanner;

class Person {
    String name;
    String streetNum; 
    String area;

    public Person(String name, String streetNum, String area) {
        this.name = name;
        this.streetNum = streetNum;
        this.area = area;
    }
}

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       Person [] people = new Person[n];

       for (int i = 0; i < n; i++) {
        String userName = sc.next();
        String userNum = sc.next();
        String userArea = sc.next();

        people[i] = new Person(userName, userNum, userArea);
       }

        int idx = 0;
        for (int i = 1; i < n; i++) {
            if (people[idx].name.compareTo(people[i].name) < 0) {
                idx = i;
            }
        }
        System.out.println("name " + people[idx].name);
        System.out.println("addr " + people[idx].streetNum);
        System.out.println("city " + people[idx].area);  
    }
}