import java.util.*;

class Weather {
    String date;
    String day;
    String info;
    
    public Weather(String date, String day, String info) {
        this.date = date;
        this.day = day;
        this.info = info;
    }
}

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       Weather [] data = new Weather[n];

       for (int i = 0; i < n; i++) {
        String date = sc.next();
        String day = sc.next();
        String info = sc.next();

        data[i] = new Weather(date, day, info);
       }

       Weather [] rainData = new Weather[n];

       int cnt = 0;
       for (int i = 0; i < n; i++) {
        if (data[i].info.equals("Rain")) {
            rainData[cnt++] = data[i];
        }
       }

      int idx = 0;
       for (int i = 1; i < cnt; i++) {
        if (rainData[idx].date.compareTo(rainData[i].date)>0) {
            idx = i;
        }
       }
       
       System.out.printf("%s %s %s", rainData[idx].date, rainData[idx].day, rainData[idx].info);
    }
}