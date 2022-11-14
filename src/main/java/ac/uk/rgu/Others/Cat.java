package ac.uk.rgu.Others;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    @Override
    public String makeNoise(){
        return name + ": " + "Meaw";
    }
    
    
}
