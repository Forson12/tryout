package ac.uk.rgu;

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
    // }

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

        CanFly[]  FlyingThings = new CanFly[3]; 
        FlyingThings[0] = new Eagle("Kenny");
        FlyingThings[1] = new Pegasus("Mane");
        FlyingThings[2] = new Plane();
        //acceptFlyingThing(FlyingThing);
        //FlyingThings[1].fly();


         for (int i=0; i < FlyingThings.length; i++){
            System.out.println(FlyingThings[i].getFlyingDistance());

        } 




    }
    
    // public static void acceptAnimal(Animal animal){
    //     //System.out.println(animal.makeNoise());

        

    // }

    public static void acceptFlyingThing(CanFly thing){
        thing.fly(); 
    }




}