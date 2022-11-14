package ac.uk.rgu.Others;

public class Dog extends Animal{

    public Dog(String name){
        super(name); 
    }

    @Override
    public String makeNoise() {
        // TODO Auto-generated method stub
        return name + ": " + "Mooow";
    } 
    
}
