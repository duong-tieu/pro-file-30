package bai10;

import java.util.Scanner;

  class Main {

              public static final String KHONG = "không";
              public static final String MOT = "một";
              public static final String HAI = "hai";
              public static final String BA = "ba";
              public static final String BON = "bốn";
              public static final String NAM = "năm";
              public static final String SAU = "sáu";
              public static final String BAY = "bảy";
              public static final String TAM = "tám";
      public static final String [] numbers = {KHONG, MOT, HAI, BA,
              BON, NAM, SAU, BAY, TAM, CHIN};

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập số cần dịch: ");
        int number = scanner.nextInt();
       for(int i = 1 ; i < numbers.length; i++){
           if (number < i){
               System.out.println("number:"+ numbers[i]);
           }
       }
    }
}