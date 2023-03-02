import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int number,sum = 0;

        for(int i=0; i < n; i++){
            System.out.println("Nhap So thu "+ (i+1));
            number = sc.nextInt();
            sum += number;
        }
        int tbc = sum / n;
        System.out.println("Trung binh cong = "+tbc);

    }
}
