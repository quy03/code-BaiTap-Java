import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) {
        int firstNumber, seconNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so thu 1: ");
        firstNumber = sc.nextInt();
        System.out.println("Nhap so thu 2: ");
        seconNumber = sc.nextInt();

        //tinh tong
        int sum = firstNumber + seconNumber;
        System.out.println("Tong = "+ sum);

        //tinh hieu
        int hieu = firstNumber - seconNumber;
        System.out.println("Hieu = "+ hieu);

        // tinh tich
        int tich = firstNumber * seconNumber;
        System.out.println("Tich = "+ tich);

        // tinh thuong
        int thuong = firstNumber / seconNumber;
        System.out.println("Thuong =  "+ thuong);

        // chia lay du
        int du = firstNumber % seconNumber;
        System.out.println("Chia lay du =  "+ du);

        //toan tu so sanh
        if(firstNumber > seconNumber){
            System.out.println("So thu 1 lon hon so thu 2>");
            
        }
        if(firstNumber < seconNumber){
            System.out.println("So thu 1 nho hon so thu 2.");
        }
        else{
            System.out.println("So thu 1 bang so thu 2.");
        }
    }
}