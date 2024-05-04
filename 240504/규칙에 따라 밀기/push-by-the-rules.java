import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String a = sc.next();
       String str = sc.next();
       int lenA = a.length();
   
       char [] arr = str.toCharArray();
       int lenArr = arr.length;

       for (int i = 0; i < lenArr; i++) {
            if (arr[i] == 'L') {
                a = a.substring(1) + a.substring(0,1);
            } else {
                a = a.substring(lenA - 1) + a.substring(0, lenA - 1); 
            }
       }

       System.out.print(a);
    }
}