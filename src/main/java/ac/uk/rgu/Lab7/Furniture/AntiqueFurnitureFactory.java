package ac.uk.rgu.Lab7.Furniture;

public class AntiqueFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair getChair() {
        return new AntiqueChair();
    }

    @Override
    public Table getTable() {
        return new AntiqueTable();
    }
    
}
