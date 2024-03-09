import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int aD = sc.nextInt();

        String b = sc.next();
        int bD = sc.nextInt();

        String c = sc.next();
        int cD = sc.nextInt();

        int count = 0;
        String grade;

        if (a.equals("Y")) {
            if (aD >= 37) {
                grade = "A";  
                count ++;  
            } else {
                grade = "C"; 
            }
            
        } else {
             if (aD >= 37) {
                grade = "B";    
            } else {
                grade = "D"; 
            }
        }

        if (a.equals("Y")) {
            if (aD >= 37) {
                grade = "A";  
                count ++;  
            } else {
                grade = "C"; 
            }
            
        } else {
             if (aD >= 37) {
                grade = "B";    
            } else {
                grade = "D"; 
            }
        }

        if (a.equals("Y")) {
            if (aD >= 37) {
                grade = "A";  
                count ++;  
            } else {
                grade = "C"; 
            }
            
        } else {
             if (aD >= 37) {
                grade = "B";    
            } else {
                grade = "D"; 
            }
        }

        if (count >= 2){
            System.out.println("E");
        } else {
            System.out.println("N");
        }

    }
}