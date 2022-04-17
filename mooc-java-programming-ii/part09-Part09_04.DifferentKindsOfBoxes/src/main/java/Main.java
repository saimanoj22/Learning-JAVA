
public class Main {

    public static void main(String[] args) {
        // You can test your program here
        // Task - 1
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

        // Task - 2
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));

        // Task - 3
        MisplacingBox mbox = new MisplacingBox();
        mbox.add(new Item("Saludo", 5));
        mbox.add(new Item("Pirkka", 5));

        System.out.println(mbox.isInBox(new Item("Saludo")));
        System.out.println(mbox.isInBox(new Item("Pirkka")));
    }
}
