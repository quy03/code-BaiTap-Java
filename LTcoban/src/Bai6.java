import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so giai thua: ");
        int number = sc.nextInt();
        int giaiThua = 1;
        int i =1;
        do{
            giaiThua *= i;
            i++;
        }while(i <= number);
        System.out.println("Gia thua cua "+ number +" la : "+giaiThua);
    }
}
