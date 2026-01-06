package behaviourial.mediator.good;

public class Kitchen {

    public void prepareFood(String order) {
        System.out.println("Kitchen prepares: " + order);
    }
    public void talkToChef(String order) {
        System.out.println("Kitchen - send cook: " + order);
    }

}
