package ac.uk;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    @Override
    public String makeNoise(){
        return name + ": " + "Meaw";
    }
    
    
}
