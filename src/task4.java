import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pizza type : ");
        String pizza = sc.nextLine();

        if (pizza.equalsIgnoreCase("peperoni")) {
            System.out.println(pizza + " is a peperoni");
        } else if (pizza.equalsIgnoreCase("Cheese")) {
            System.out.println(pizza + " is a cheese");
        } else {
            System.out.println(pizza + "marqaritta");
        }
    }
}