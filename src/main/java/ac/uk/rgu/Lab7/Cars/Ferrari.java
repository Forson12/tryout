package ac.uk.rgu.Lab7.Cars;

public class Ferrari implements Car{

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
        
    }
    public void SomeFerarriMethd(){
        System.out.println("Some ferarri Method");
        
    }
    
}
