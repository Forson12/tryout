package ac.uk.rgu.Lab7.Cars;

public class Ford implements Car{

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
        
        
    }
    public void SomeFordMethd(){
        System.out.println("Some ford Method");
        
    }
}
