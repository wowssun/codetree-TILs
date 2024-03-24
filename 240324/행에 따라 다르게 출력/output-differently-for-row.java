import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i % 2 == 0)   //  if로 먼저 판단 후에 
                    cnt++;
                else
                    cnt += 2;
                
                System.out.print(cnt + " ");  // 출력
            }
            System.out.println();
        }

    }
}