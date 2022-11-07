package ac.uk.rgu.Lab6;

public class ForwardPrintStrategy implements PrintStrategy{

    @Override
    public void print(String[] values) {
        // TODO Auto-generated method stub
        for(String value : values){
            System.out.println(value);
        }
        
    }
    
}
