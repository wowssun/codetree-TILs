import java.util.Scanner;

public class Main {

    public static boolean isSequence (int [] a, int [] b) {
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[0]) {
                int cnt = 0;
                for (int j = 0; j < b.length; j++) {
                    if (a[i+j] == b[j]) {
                        cnt++;    
                    }
                }
                if (cnt == b.length) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int [] numbersA = new int[n1];
        int [] numbersB = new int[n2];

        for (int i = 0; i < n1; i++) {
            numbersA[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            numbersB[i] = sc.nextInt();
        }

        if (isSequence(numbersA, numbersB)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        
     }

 }