package solid.singleResponsibility.bad;


// STORY 1 -  only one person is working in the store
public class Restaurant {
    public static void main(String[] args) {
        // common service - 1 person doing all the work
        CommonService commonService = new CommonService();
        commonService.kitchenWork();
        commonService.cookFood();
        commonService.billing();
    }
}
