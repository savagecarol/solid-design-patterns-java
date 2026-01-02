package behaviourial.iterator.good;

public class Restaurant {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Iterator iterator = menu.createIterator();

        while (iterator.hasNext()) {
            System.out.println("Menu Item: " + iterator.next());
        }
    }
}
