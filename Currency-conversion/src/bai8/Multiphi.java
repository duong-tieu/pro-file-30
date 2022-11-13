package bai8;

public class Multiphi {
    public static void main(String[] args){
        System.out.println("table");
        System.out.print("");
        for(int a = 1; a <=10; a++ ){
            System.out.print(""+a);
         System.out.println("\n----------------");
         for (int b = 1; b <=10;b++){
             System.out.print(  b + "|");
             for (int c = 1; c <= 10; c++); {
             System.out.printf("%4d", b * c );
            }
        System.out.println();
        }
    }
}
