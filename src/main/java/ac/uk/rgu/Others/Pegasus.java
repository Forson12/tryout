package ac.uk.rgu.Others;
// A class using the interface CanFly
public class Pegasus extends Horse implements CanFly{

    public Pegasus(String name) {
        super(name);
        //TODO Auto-generated constructor stub 
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Pegasus is flying");
        
    }
    

}
