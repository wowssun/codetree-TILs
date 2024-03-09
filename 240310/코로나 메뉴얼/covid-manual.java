import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int aD = sc.nextInt();

        String b = sc.next();
        int bD = sc.nextInt();

        String c = sc.next();
        int cD = sc.nextInt();

       // A가 2명 이상인지 판단하기
        if(a == 'Y' && aD >= 37) {
            // 첫 번째 사람이 A라면, 남은 두 사람 중 한 사람이라도 A면 됩니다.
            if((b == 'Y' && bD >= 37) || (c == 'Y' && cD >= 37)){
                System.out.println("E");
            }else {
                System.out.println("N");
            }
        }
        else {
            // 첫 번째 사람이 A가 아니라면, 남은 두 사람 모두 A여야만 합니다.
            if((b == 'Y' && bD >= 37) && (c == 'Y' && cD >= 37)) {
                System.out.println("E");
            }else {
                System.out.println("N");
            }
        }
    }
}