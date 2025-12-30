package solid.interfaceSegregation.good;


public class Chef implements ChefStaff {

    @Override
    public void cookFood() {
        System.out.println("i can cook");
    }

}
