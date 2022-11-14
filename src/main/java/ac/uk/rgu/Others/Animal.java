package ac.uk.rgu.Others;

public abstract class Animal {

    protected String name;

    public Animal(String name){
        this.name = name;
    }
    public abstract String makeNoise();
    
}
