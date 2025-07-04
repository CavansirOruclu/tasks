import java.util.Scanner;

public class hometask {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("yashinizi daxil edin : ");
            int x = sc.nextInt();
            if (x <= 12) {
                System.out.println("12 yashdan kicikler pulsuz icki alir ");
            } else if (x > 12 && x < 18) {
                System.out.println("yeni yetmeler telebe endirimi alir   ");
            } else if (x > 65) {
                System.out.println("yashlilar ferqli endirim alir ");
            } else {
                System.out.println("yashiniza uygun endirim yoxdur  ");

            }
            System.out.println("Qehve menyusu secin ");
            int y = sc.nextInt();
            switch (y) {
                case 1:
                    System.out.println("sizin qehve seciminiz : espresso  ");
                    break;
                case 2:
                    System.out.println("sizin qehve seciminiz : latte  ");
                    break;
                case 3:
                    System.out.println("sizin qehve seciminiz : mocha  ");
                    break;
                case 4:
                    System.out.println("sizin qehve seciminiz : americano  ");
                    break;
                case 5:
                    System.out.println("sizin qehve seciminiz : macchiato  ");
                    break;
                default:
                    System.out.println("yaslish secim yeniden daxil edin ");
            }
        }
    }
}
