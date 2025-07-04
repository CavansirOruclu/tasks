import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("batman ");
                break;
            case 2:
                System.out.println("superman");
                break;
            case 3:
                System.out.println("flash ");
                break;
            default:
                System.out.println("Not a valid number");
        }
    }
}
