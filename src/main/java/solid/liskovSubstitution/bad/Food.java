package solid.liskovSubstitution.bad;

// parent class means --> all the child will follow its property
// but lets say one child is misbehaving
public class Food {
    void prepare(){
        System.out.println("Parent Food Class gives water");
    }
}
