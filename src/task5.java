import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.println("Enter operation: ");
            String op = sc.next();
            switch (op) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                case "/":
                    if (num2 != 0)
                        System.out.println(num1 / num2);
                    else {
                        System.out.println(num1 / num2);
                    }System.out.println("sifira bolme yoxdur");
                    break;

                default:
                    System.out.println("Invalid operation");
            }

        }
    }
}