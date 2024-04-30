import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = "";   // 문자열로 변환하고 새로운 문자열 만들기 

        int len = str.length();
        int cnt = 1;
        char curr = str.charAt(0);  // 비교할 현재 첫문자.

        for (int i = 1; i < len; i++) {
            if (str.charAt(i) == curr) {  // 현재문자와 문자 비교 
                cnt++;  // 같다면 cnt++ 개수 추가 
            } else {    // 같지 않다면 
                str2 += curr;       // 지금껏 비교해온 문자 먼저 붙이고
                str2 += Integer.toString(cnt); // 그 다음 해당 문자 개수 붙이기
                                               // 안전하게 숫자를 문자열로 변환하고 붙여야함.
                curr = str.charAt(i);          // 앞의 문자와 다른 다음 문자로 초기화
                cnt = 1;                        // cnt도 마찬가지!
            }
        }
        // 여기서 한번 더 해주는 이유는 마지막 같은 문자열 덩어리는 else가 처리 안되니까
        str2 += curr;       
        str2 += Integer.toString(cnt);

        System.out.println(str2.length());
        System.out.println(str2);
    }
}