import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String pattern = sc.next();
        String [] arr = new String[n];
        String [] hasPattern = new String[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            boolean result = true;
            if (arr[i].length() >= pattern.length()) {
                for (int j = 0; j < pattern.length(); j++) {
                if (arr[i].charAt(j) != pattern.charAt(j)) {
                    result = false;
                    break;
                }
            }
            }
            
            if (result) {
                hasPattern[idx++] = arr[i];
            }
        }

        Arrays.sort(hasPattern,0,idx);
        
        System.out.print(hasPattern[k-1]);
        
    }
}