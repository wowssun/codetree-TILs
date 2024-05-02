import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();
        char [] arr = s.toCharArray();

        for (int i = 0; i < q; i++) {
            int answer = sc.nextInt();

            if (answer == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                char tmp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1]= tmp;

                s = String.valueOf(arr);
                System.out.println(s);   

            } else {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == a) {
                        arr[j] = b;
                    }
                }
                s = String.valueOf(arr);
                System.out.println(s); 
            }
        }
    }
}