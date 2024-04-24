import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int[n][m];
        int num = 1;

        for(int startCol = 0; startCol < m; startCol++) {
            int currRow = 0; // 시작점이 되는 부분 행이 0일 때 , 초기화 
            int currCol = startCol;  // 열은 하나씩 증가 

            while(currCol >= 0 && currRow < n) {  // 행은 n보다 작아야 하고, 열은 0보다 같거나 크고 
                arr[currRow][currCol] = num; 

                // 대각선 밑으로 내려가니 행은 하나씩 커지고 열은 하나씩 줄어든다.
                currRow++;
                currCol--;
                num++;
            }
        }
        //여기까지는 행 시작점이 0부터였고
        //다음은 행이 1부터 시작하며 증가, 열은 마지막열에서 시작한다.

        for(int startRow = 1; startRow < n; startRow++) {
            int currRow = startRow;
            int currCol = m - 1;

            while(currCol >= 0 && currRow < n) {  // 그 다음 채워지는 방식은 위와 같다. 
                arr[currRow][currCol] = num;

                
                currRow++;
                currCol--;
                num++;
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}