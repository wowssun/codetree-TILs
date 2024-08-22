import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student) {
        if (this.kor == student.kor){
            if (this.eng == student.eng) {
                return student.math - this.math;
            }
            return student.eng - this.eng;
        }    
        return student.kor - this.kor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student [] st = new Student[n];

        for (int i = 0; i < n; i ++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            st[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(st);

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %d %d %d\n", st[i].name, st[i].kor, st[i].eng, st[i].math);
        }
    }
}