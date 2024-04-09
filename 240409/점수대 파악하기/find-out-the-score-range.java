import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int [] score = new int[100];
        int [] newScore = new int[11];
        int i = 0;

        while (true) {
            score[i] = sc.nextInt();

            if (score[i] == 0) {
                break;
            }

            newScore[score[i] /10]++;
            i++;
        }

        for (int j = 10; j > 0; j--) {
            System.out.println((j * 10) + " - " + newScore[j]);
        }
    }
}