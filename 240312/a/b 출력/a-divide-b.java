import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // format 함수로는 소수점 20번째까지의 값을 못구함.
        System.out.print(a / b + ".");  // 정수 부분을 미리 찍어놓기

        a %= b;  // a % b 의 나머지를 a에 저장 

        for (int i = 1; i <= 20; i++) {
            // 나머지에 10 곱한 값을 기준으로
            // b로 나누었을 떄의 몫
            a *= 10;  // 나머지에 10 곱하기 
            System.out.print(a / b); // 계속 연결 나머지에 10 곱한 값 / b 몫 

             a %= b; // 나머지 값 a 에 저장 
        }
    }
}