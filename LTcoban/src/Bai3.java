import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhao ten: ");
        String name = sc.nextLine();
        System.out.println("Nhao nam sinh: ");
        int number = sc.nextInt();
        if((2023-number) < 16){
            System.out.println("Ban "+ name +" o do tuoi vi thanh nien.");
        }
        if((2023-number) >= 16 && (2023-number) < 18){
            System.out.println("Ban "+ name +" o do tuoi truong thanh.");
        }
        if((2023-number) >= 18){
            System.out.println("Ban "+ name +" da gia.");
        }
    }
}