import java.util.Scanner;

class Goods{
    String product;
    int code;

    public Goods() {
        product = "codetree";
        code = 50;
    }

     public Goods(String product, int code) {
        this.product = product;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        String productName = sc.next();
        int productCode = sc.nextInt();

        Goods go1 = new Goods();
        Goods go2 = new Goods(productName, productCode);

        System.out.printf("product %d is %s\n", go1.code, go1.product);
        System.out.printf("product %d is %s\n", go2.code, go2.product);
    }
}