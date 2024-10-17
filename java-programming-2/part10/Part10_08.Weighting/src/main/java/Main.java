

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!

        Suitcase suitcase = new Suitcase(20);
        Item item = new Item("item1", 5);
        Item item2 = new Item("item2", 10);

        suitcase.addItem(item);
        suitcase.addItem(item2);

        suitcase.printItems();


    }

}
