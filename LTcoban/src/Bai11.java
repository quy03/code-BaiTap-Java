import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n phan tu mang: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        int tg;
        System.out.println("Nhap phan tu mang :");
        for(int i=0; i<n; i++){
            System.out.println("A["+(i+1)+"] = ");
            A[i] = sc.nextInt();
        }
        System.out.println("Xuat mang da nhap");
        for(int i=0; i<n; i++){
            System.out.println(A[i]);
        }
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j < n; j++){
                if(A[i] > A[j]){
                    tg = A[i];
                    A[i] = A[j];
                    A[j] = tg;
                }
            }
        }
        System.out.println("Xuat mang da sap xep");
        for(int i=0; i<n; i++){
            System.out.println(A[i]);
        }
    }
}
