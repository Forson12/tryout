package ac.uk.rgu.Lab6;

public class VerboseLogger implements Logger{
    //Singleton Design Pattern 
    private VerboseLogger(){

    }
    private int numTimesUsed = 0; 

    private static VerboseLogger instance = null; 

    public static VerboseLogger getInstance (){
        if(instance == null){
            instance = new VerboseLogger();
        }
        return instance; 

    } 

    @Override
    public void log(String arg) {
        this.numTimesUsed++; 
        // TODO Auto-generated method stub
        System.out.println("Verbose Logger " + arg);
        System.out.println(this.numTimesUsed);
        
    }
    
}
