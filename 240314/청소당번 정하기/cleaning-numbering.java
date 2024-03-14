import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int cntClass = 0;
        int cntHall = 0;
        int cntToilet = 0;

        for(int i = 1; i <= n; i++) {
            if(i % 12 == 0) {    // 12일부터 확인 
                cntToilet++;
            } else if(i % 3 == 0) {   // 그다음 3일
                cntHall++;
            }else if(i % 2 == 0) {    // 그 다음 2일
                cntClass++;
        }
        }
        System.out.print(cntClass + " " + cntHall + " " + cntToilet);
    }
}