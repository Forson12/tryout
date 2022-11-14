package ac.uk.rgu.Lab7.Furniture;

public class MordernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair getChair() {
        // TODO Auto-generated method stub
        return new MordernChair();
    }

    @Override
    public Table getTable() {
        // TODO Auto-generated method stub
        return new MordernTable();
    }
    
}
