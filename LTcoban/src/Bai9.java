import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char KT;
        String chuoi;
        System.out.println("Nhap vao chuoi bat ki: ");
        chuoi = sc.nextLine();

        System.out.println("Cac ki tu trong chuoi la: ");
        for(int i=0; i < chuoi.length() ; i++){
            KT = chuoi.charAt(i);
            System.out.println(KT);
        }
    }
}
