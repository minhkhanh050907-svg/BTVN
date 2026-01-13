import java.util.Scanner;
import java.util.Random;

public class BaiTap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        // Tạo số ngẫu nhiên
        double soNgauNhien = 1.0 + (100.0 - 1.0) * rd.nextDouble();
        
        System.out.print("Nhập vào một số thực từ 1-100: ");
        double soNhap = sc.nextDouble();
        
        System.out.printf("Số ngẫu nhiên của máy là: %.2f\n", soNgauNhien);
        
        if (soNhap > soNgauNhien) {
            System.out.println("Số bạn nhập LỚN HƠN số ngẫu nhiên.");
        } else if (soNhap < soNgauNhien) {
            System.out.println("Số bạn nhập NHỎ HƠN số ngẫu nhiên.");
        } else {
            System.out.println("Hai số BẰNG NHAU.");
        }
    }
}