import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so hang: ");
        int row = sc.nextInt();
        System.out.println("Nhap so cot: ");
        int col = sc.nextInt();

        int Arr[][] = new int[row][col];
        for(int i= 0; i<row; i++){
            for(int j=0; j<col; j++){
            System.out.println("Arr["+ i+ "]["+ j +"] = ");
                Arr[i][j] = sc.nextInt();
            }
        }
        int max = Arr[0][0];
        for(int i= 0; i<row; i++){
            for(int j=0; j<col; j++){
                if(Arr[i][j] > max){
                    max = Arr[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat trong mang la: "+ max);
    }
}
