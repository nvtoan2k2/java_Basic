import java.util.Scanner;

public class doiTienTe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float USD = sc.nextFloat();
        double VND = 23.755;
        System.out.println("USD doi ra gia tri tien VND: "+ USD*VND);
    }
}
