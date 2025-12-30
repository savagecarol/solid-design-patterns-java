package solid.singleResponsibility.bad;

// common service [cook food AND billing AND kitchen work]
public class CommonService {
    public void cookFood(){
        System.out.println("cook Food...");
    }
    public void billing(){
        System.out.println("billing Work...");
    }
    public void kitchenWork()
    {
        System.out.println("kitchen Work...");
    }
}
