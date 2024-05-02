import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char [] arr = str.toCharArray();
        char fir = arr[0];
        char sec = arr[1];
                    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == fir) {
                arr[i] = sec;
            } else if (arr[i] == sec){
                arr[i] = fir;
            }       
        }
        str = String.valueOf(arr);
        System.out.print(str);
    }
}