import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 1;

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) { // 0행부터 시작 2, 4...
                for(int j = 0; j < n; j++) {
                    System.out.print(cnt + " ");
                    cnt++; //  1씩 증가
                }
            } else { // 1행부터 시작 3,5...
                cnt += 1; // 짝수 행의 시작 전에 cnt를 조정 
                for(int j = 0; j < n; j++) {
                    System.out.print(cnt + " ");
                    if(j == (n-1)){
                        cnt += 1;
                    } else {
                         cnt += 2; //  cnt가 2씩 증가
                    }
                   
                }
            }
            System.out.println();
        }

    }
}