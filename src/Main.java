import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("yashinizi girin  : ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("girise icaze verilir");
        }
        else {
            System.out.println("icaze verilmir ");
        }
        }
    }
