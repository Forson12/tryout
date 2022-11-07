package ac.uk.rgu.Lab6;

//import javax.xml.validation.Validator;

import ac.uk.Laptop;
import ac.uk.Laptop.laptopScreen;

// import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
// import javafx.stage.Stage;

// import java.io.IOException;

//import ac.uk.Animal;

/**
 * JavaFX App
 */
public class App {
    
    // private static Scene scene;

    // @Override
    // public void start(Stage stage) throws IOException {
    //     scene = new Scene(loadFXML("myscene"), 640, 480);
    //     stage.setScene(scene);
    //     stage.show();
    // }

    // static void setRoot(String fxml) throws IOException {
    //     scene.setRoot(loadFXML(fxml));
    // }

    // private static Parent loadFXML(String fxml) throws IOException {
    //     FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    //     return fxmlLoader.load();


     //}

    // for LAb 6
    // for Singleton
    // private Logger logger; 
    // public  void setLogger(Logger logger) {
    //     this.logger = logger;
    // }
    
    //for commands 
    private static command[] commands = new command[10]; 

    private  String[] words = {"Computing", "Aberdeen", "Katherine", "Cassey"};

    public void doSomething(){
        // if(this.logger != null){
        //     logger.log("I'm doing something");
        // }
        System.out.println("I'm doing something");
    }


    public static void main(String[] args) {
        //launch();
       // Cat cat = new Cat("Main");
        // String noise = cat.makeNoise();

        // System.out.println(noise);

        //Dog dog = new Dog("new ");
        // noise = dog.makeNoise(); 
        // System.out.println(noise
        // );

        //acceptAnimal(dog);
        //CanFly FlyingThing = new Eagle("Meny"); 

       // FlyingThing.fly();

        //Predetor eatingThing = new Eagle("Kenny");
        //eatingThing.eat();

        //acceptFlyingThing(FlyingThing);

        // CanFly[]  FlyingThings = new CanFly[3]; 
        // FlyingThings[0] = new Eagle("Kenny");
        // FlyingThings[1] = new Pegasus("Mane");
        // FlyingThings[2] = new Plane();
        //acceptFlyingThing(FlyingThing);
        //FlyingThings[1].fly();


        //  for (int i=0; i < FlyingThings.length; i++){
        //     System.out.println(FlyingThings[i].getFlyingDistance());

        // } 

        // LAa 5
        // Laptop laptop = new Laptop(); 
        // laptopScreen  screen = laptop.new laptopScreen(15, "1024/720"); 
        // System.out.println(screen);

        // Lab 6 
        //Testing the singleton Pattern
        // App app = new App(); 
        // VerboseLogger logger = VerboseLogger.getInstance(); 
        // app.setLogger(logger); 
        // app.doSomething(); 

        //Testing the Command Behavoural Pattern
        // App instance = new App(); 
        // command doSomethingCommand = new MainAppCommand(instance); 
        // commands[0] = doSomethingCommand; 

        // Computer pc = new Computer(); 
        // commands[1] = pc:: turnOn; 

        /*a lot of things happen  */
        //Testing the commands
        //commands[0].execute();
        //commands[1].execute();
        
        // Testing the Stategy Pattern
        App instance = new App(); 
        ForwardPrintStrategy s = new ForwardPrintStrategy(); 
        instance.printWords(s);
        System.out.println(" ");
        
        // Printing the Array Backwards
        PrintStrategy s2 = (Values) ->{
            for(int i = Values.length-1; i >=0; i--){
                System.out.println(Values[i]);

            }
        };
        instance.printWords(s2);


    }
    
    //Stategy Pattern
    public void printWords(PrintStrategy printStrategy){
        printStrategy.print(this.words);
        
    }

    // public static void acceptAnimal(Animal animal){
    //     //System.out.println(animal.makeNoise());

        

    // }

    // public static void acceptFlyingThing(CanFly thing){
    //     thing.fly(); 
    // }




}