import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
            System.out.println(" bazar ertesi ");
                break;
            case 2:
            System.out.println("Your number is 2");
                break;
            case 3:
                 System.out.println(" 3 gun ");
                  break;
            case 4:
                  System.out.println("4 cu gun ");
                  break;
            case 5:
                   System.out.println("cume");
                   break;
            case 6:
                    System.out.println("senbe");
                    break;
             case 7: System.out.println("bazar");
                    break;
                    default:
                        System.out.println("Your number is not valid");
        }
    }
}
