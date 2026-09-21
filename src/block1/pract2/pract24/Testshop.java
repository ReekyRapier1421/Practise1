package block1.pract2.pract24;
import java.util.Scanner;

public class Testshop {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Shop shop=new Shop();

        while (true)
        {
            System.out.println("\n1 - добавить, 2 - удалить, 3 - найти, 4 - показать все, 0 - выход");
            int choice=Integer.parseInt(in.nextLine());

            if (choice == 1)
            {
                System.out.print("Производитель:");
                String brand=in.nextLine();
                System.out.print("Цена:");
                double price=Double.parseDouble(in.nextLine());
                shop.add(new Computer(brand, price));
            }
            else if (choice == 2)
            {
                shop.printAll();
                System.out.print("Номер для удаления:");
                shop.remove(Integer.parseInt(in.nextLine()));
            }
            else if (choice == 3)
            {
                System.out.print("Производитель:");
                shop.search(in.nextLine());
            }
            else if (choice == 4)
            {
                shop.printAll();
            }
            else if (choice == 0)
            {
                break;
            }
        }
    }
}
