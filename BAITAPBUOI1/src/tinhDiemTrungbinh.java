import java.util.Scanner;

public class tinhDiemTrungbinh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float math = sc.nextFloat();
        float physical = sc.nextFloat();
        float chemistry = sc.nextFloat();
        float average = (math + physical + chemistry) / 3;
        System.out.println("Diem trung binh 3 mon toan ly hoa: " + average);
    }
}
