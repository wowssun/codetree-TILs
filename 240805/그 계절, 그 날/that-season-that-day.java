import java.util.Scanner;

public class Main {

    public static int lastDay(int y, int m) {
        if(m == 2) {
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                return 29;
            } else {
                return 28;
            }
        }
            
        if(m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }

        return 31;
    }


    public static boolean existSeason(int y, int m, int d) {
        if(m <= 12 && d <= lastDay(y, m)) {
            return true;
        }
            
        return false;
    }

    public static String season (int y, int m, int d) {
        String result = "";
        if (existSeason(y, m, d)) {
            switch (m) {
            case 3: case 4: case 5: result = "Spring"; break;
            case 6: case 7: case 8: result ="Summer"; break;
            case 9: case 10: case 11: result ="Fall"; break;
            case 12: case 1: case 2: result ="Winter"; 
            }
            return result;
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        System.out.print(season(year, month, day));

        
    }
}