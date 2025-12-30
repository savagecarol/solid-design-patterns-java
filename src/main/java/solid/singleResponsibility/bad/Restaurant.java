package solid.singleResponsibility.bad;

// one man is doing all these things
public class Restaurant {
    public static void main(String[] args) {
        // common service
        CommonService commonService = new CommonService();
        commonService.kitchenWork();
        commonService.cookFood();
        commonService.billing();
    }
}
