import java.util.Scanner;

public class Main {

    public static void multiple(int a, int c) {
        System.out.print(a + " * " + c + " = " + (a*c));
    }
    public static void plus(int a, int c) {
        System.out.print(a + " + " + c + " = " + (a+c));
    }
    public static void minus(int a, int c) {
        System.out.print(a + " - " + c + " = " + (a-c));
    }
    public static void divide(int a, int c) {
        System.out.print(a + " / " + c + " = " + (int)(a/c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        switch(o) {
            case '*' : multiple(a, c); break;
            case '+' : plus(a, c); break;
            case '-' : minus(a, c); break;
            case '/' : divide(a, c); break;
            default : System.out.print("False");
        }
    }
}