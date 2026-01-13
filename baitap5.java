import java.util.Random;

public class BaiTap5 {
    public static void main(String[] args) {
        Random rd = new Random();
        int so = rd.nextInt(80 - 3 + 1) + 3;
        
        System.out.println("Số ngẫu nhiên chọn được là: " + so);
        
        if (so % 2 == 0) {
            System.out.println(so + " là số chẵn.");
        } else {
            System.out.println(so + " là số lẻ.");
        }
    }
}