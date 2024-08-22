import java.util.*;

class Student implements Comparable<Student> {
    int height;
    int weight;
    int num;

    public Student(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student student) {
        if (this.height != student.height){
            return student.height - this.height;
        }
        if (this.weight != student.weight) {
            return student.weight - this.weight;
        }
        return this.num - student.num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student [] st = new Student[n];

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            int num = i+1;

            st[i] = new Student(height, weight, num);
        }

        Arrays.sort(st);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", st[i].height, st[i].weight, st[i].num);
        }
    }
}