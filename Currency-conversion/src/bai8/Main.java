package bai8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double USD = 1;
        double vnd;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền bạn cần quy đổi");
        vnd  = sc.nextDouble();
        double quydoi = vnd / 24000;
        System.out.println("giá trị đồng vn được quy đổi" + quydoi);
    }
}