package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<CommerceSystem> products = new ArrayList<>();

    public static void main(String[] args) {

        CommerceSystem p0 = new CommerceSystem("Galaxy S24", "1,200,000원", "최신 안드로이드 스마트폰", 50);
        CommerceSystem p1 = new CommerceSystem("iPhone 16", "1,350,000원", "Apple의 최신 스마트폰", 50);
        products.add(p0);
        products.add(p1);

        start();
    }

    static void start(){
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
        for (CommerceSystem p : products) {
            System.out.print((i+1) + ". ");
            System.out.println(products.get(i));
            i++;
        }
        System.out.println("0. 종료");
        String exit = input.next();
        if (exit.equals("0")){
            System.out.println("커머스 프로그램을 종료합니다.");
        }
    };
}
