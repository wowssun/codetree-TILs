import java.util.Scanner;

class AbStation {
    int aValue;
    int bValue;

    public AbStation(int a, int b) {
        this.aValue = a;
        this.bValue = b;
    }
}

public class Main {

    public static void calculate(AbStation ab) {
        if (ab.aValue > ab.bValue) {
            ab.aValue += 25;
            ab.bValue *= 2;
        } else {
            ab.aValue *= 2;;
            ab.bValue += 25;;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        AbStation ab = new AbStation(a, b);

        calculate(ab);

        System.out.print(ab.aValue + " " + ab.bValue);


    }
}