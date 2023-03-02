import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so: ");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("So da nhap la so chan.");
        }
        else{
            System.out.println("So da nhap la so le.");
        }
    }
}
