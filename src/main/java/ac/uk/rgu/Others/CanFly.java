package ac.uk.rgu.Others;

// interface 
public interface CanFly {

    public void fly();

    // default method
    default int getFlyingDistance(){
        return -1; 
    }

}
