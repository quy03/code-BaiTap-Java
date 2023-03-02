import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao mot chuoi: ");
        String input = sc.nextLine();

        System.out.println("Nhap vao ky tu: ");
        char KT = sc.nextLine().charAt(0);

        int count = 0;
        if(input.length() <= 80){
            for(int i=0; i < input.length(); i++){
                if(input.charAt(i) == KT){
                    count++;
                }
            }
        }
        System.out.println("Ky tu ' "+ KT +" ' xuat hien "+ count +" lan trong chuoi");
    }
}