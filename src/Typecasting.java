import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two byte values as input : ");
        byte a = sc.nextByte();
        byte b = sc.nextByte();

        int val1  =a;
        int val2 =b;
        int sum = val1+val2;
        System.out.println("the sum is "+sum);

    }
}
