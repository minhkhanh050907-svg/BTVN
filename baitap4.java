import java.util.Random;

public class BaiTap4 {
    public static void main(String[] args) {
        Random rd = new Random();
        double min = 1.8;
        double max = 8.0;
       
        double soThuc = min + (max - min) * rd.nextDouble();
        
        System.out.printf("Số thực ngẫu nhiên từ 1.8 đến 8.0: %.2f\n", soThuc);
    }
}