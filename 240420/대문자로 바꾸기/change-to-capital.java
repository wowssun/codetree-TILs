import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       char [][] lower = new char[5][3];

       for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            lower[i][j] = sc.next().charAt(0);
        }
       }

       for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print((char)(lower[i][j] - 32) + " "); // 32를 빼주고 char으로 형변환 하기 
        }                                                    // 32는 A 65, a 97
        System.out.println();
       }
    }
}