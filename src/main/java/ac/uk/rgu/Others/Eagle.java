package ac.uk.rgu.Others;

// A class using the interfaces CanFly and Predator
public class Eagle extends Bird implements CanFly, Predetor{

    public Eagle(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Eagle is eatig no Noise please!!1");
        
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Eagle is Flying");
        
    }
    

    

}
