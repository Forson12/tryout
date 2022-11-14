package ac.uk.rgu.Others;

public class Plane implements CanFly{

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Plane is Flying");
        
    }

    @Override
    public int getFlyingDistance(){
        return 10; 
    }
    
}
