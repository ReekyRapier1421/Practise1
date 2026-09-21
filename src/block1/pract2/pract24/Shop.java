package block1.pract2.pract24;

public class Shop {

    private Computer[] computers=new Computer[67];
    private int counter=0;

    public void add(Computer c) {computers[counter++] = c;}


    public void remove(int number) {
        if (number<1 || number>counter) {
            System.out.println("неверное число");
            return;
        }
        for (int i=number - 1; i<counter - 1; i++)
        {
            computers[i] = computers[i + 1];
        }
        computers[--counter] = null;
    }


    public void search(String brand) {
        boolean found=false;
        for (int i=0; i<counter; i++)
        {
            if (computers[i].getBrand().equalsIgnoreCase(brand))
            {
                System.out.println(computers[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Ничего не найдено");
        }
    }

    public void printAll()
    {
        for (int i=0; i<counter; i++)
        {
            System.out.println((i+1)+". "+computers[i]);
        }
    }

}
