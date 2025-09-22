package commerce;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        Product p0 = new Product("Galaxy S24", "1,200,000원", "최신 안드로이드 스마트폰", 50);
        Product p1 = new Product("iPhone 16", "1,350,000원", "Apple의 최신 스마트폰", 50);
        products.add(p0);
        products.add(p1);

        listPrint();
    }

    static void listPrint(){
        int i = 0;
        for (Product p : products) {
            System.out.print((i+1) + ". ");
            System.out.println(products.get(i));
            i++;

        }
    };
}
