import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {

    public static void swap (IntWrapper n, IntWrapper m) {
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        IntWrapper nWrap = new IntWrapper(n);
        IntWrapper mWrap = new IntWrapper(m);


        swap(nWrap, mWrap);
        System.out.print(nWrap.value + " " + mWrap.value);
    }
}