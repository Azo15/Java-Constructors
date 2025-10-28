//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Product p1 = new Product("Azo Ismail","Shoes",23,44,21);
        p1.display();

        System.out.println("\n");
        System.out.println("\n");

        Product p2 = new Product();
        p2.display();

        System.out.println("\n");
        System.out.println("\n");

        Product p3 = new Product("Ahemet","Laptop",34);
        p3.display();

        System.out.println("\n");
        System.out.println("\n");

        Product p4 = new Product("Ali","Phone",34,54,23,"Blue");
        p4.display();

        System.out.println("\n");
        System.out.println("\n");

        Product p5 = new Product("Alex","Table",34,54,23,"Red",23);
        p5.display();

        System.out.println("\n");
        System.out.println("\n");

        Product p6 = new Product(p1);
        p6.display();


    }
}