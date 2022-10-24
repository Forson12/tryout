package ac.uk.rgu;

public abstract class Animal {

    protected String name;

    public Animal(String name){
        this.name = name;
    }
    public abstract String makeNoise();
    
}
