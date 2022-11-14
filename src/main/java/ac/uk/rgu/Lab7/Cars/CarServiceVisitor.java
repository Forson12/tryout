package ac.uk.rgu.Lab7.Cars;

public class CarServiceVisitor implements CarVisitor{

    @Override
    public void visit(Car car) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(Ford car) {
        // TODO Auto-generated method stub
        car.SomeFordMethd();
        
    }

    @Override
    public void visit(Ferrari car) {
        // TODO Auto-generated method stub
        car.SomeFerarriMethd();
    }
    
}
