import java.util.Scanner;

class AbStation {
    int value;

    public AbStation(int val) {
        this.value = val;
    }
}

public class Main {

    public static void calculate(AbStation a, AbStation b) {
        if (a.value > b.value) {
            a.value *= 2;
            b.value += 10;
        } else {
            a.value += 10;
            b.value *= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        AbStation aValue = new AbStation(a);
        AbStation bValue = new AbStation(b);

        calculate(aValue, bValue);

        a = aValue.value;
        b = bValue.value;

        System.out.print(a + " " + b);

        
    }
}