package ac.uk.rgu.Lab7.Cars;

public interface CarVisitor {
    public void visit(Car car); 

    public void visit(Ford car);
    public void visit(Ferrari car);
    
}
