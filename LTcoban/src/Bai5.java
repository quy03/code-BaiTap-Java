import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0,number = 0;
        // System.out.println("Nhap so thu 1:");
        // number = sc.nextInt();
        while(number >= 0){
            System.out.println("Nhap so:");
            number = sc.nextInt();
            sum+=number;
            if(sum > 100){
                break;
            }
        }
        System.out.println("Sum = "+ sum);
    }
}