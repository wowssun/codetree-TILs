import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[2][4];

        double sum = 0;
        double avg;

        // 입력 
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 가로 평균 
        for (int i = 0; i < 2; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            avg = sum / 4;
            System.out.printf("%.1f ", avg);
        }
        System.out.println();
        
        // 세로 평균
        for (int j = 0; j < 4; j++) {
            sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += arr[i][j];
            }
            avg = sum / 2;
            System.out.printf("%.1f ", avg);
        }
        System.out.println();

        // 전체 펑균
        sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
        }
        avg = sum / 8;
        System.out.printf("%.1f ", avg);

    }
}