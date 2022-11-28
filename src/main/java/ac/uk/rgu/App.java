package ac.uk.rgu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//import javax.sound.sampled.SourceDataLine;

import ac.uk.rgu.Lab7.Cars.Car;
import ac.uk.rgu.Lab7.Cars.CarServiceVisitor;
import ac.uk.rgu.Lab7.Cars.CarVisitor;
import ac.uk.rgu.Lab7.Cars.Ferrari;
import ac.uk.rgu.Lab7.Cars.Ford;
import ac.uk.rgu.Lab7.Furniture.AntiqueFurnitureFactory;
import ac.uk.rgu.Lab7.Furniture.Chair;
import ac.uk.rgu.Lab7.Furniture.FurnitureFactory;
import ac.uk.rgu.Lab7.Furniture.MordernFurnitureFactory;
import ac.uk.rgu.Lab7.Furniture.Table;
import ac.uk.rgu.Lab7.Lab7a.Person;
import javafx.scene.input.InputEvent;

//import javax.xml.validation.Validator;

// import ac.uk.Laptop;
// import ac.uk.Laptop.laptopScreen;

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
    //private static command[] commands = new command[10]; 

    //private  String[] words = {"Computing", "Aberdeen", "Katherine", "Cassey"};

    //public void doSomething(){
        // if(this.logger != null){
        //     logger.log("I'm doing something");
        // }
       // System.out.println("I'm doing something");
    //}


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
        // App instance = new App(); 
        // ForwardPrintStrategy s = new ForwardPrintStrategy(); 
        // instance.printWords(s);
        // System.out.println(" ");
        
        // // Printing the Array Backwards
        // PrintStrategy s2 = (Values) ->{
        //     for(int i = Values.length-1; i >=0; i--){
        //         System.out.println(Values[i]);

        //     }
        // };
        // instance.printWords(s2);

        //LAB 7 
        //Furnture Example 
        //Abstract Facory 
        // FurnitureFactory f1 = new MordernFurnitureFactory(); 
        // Chair myChair = f1.getChair();
        // System.out.println(myChair.getType());
        // Table myTable = f1.getTable(); 
        // System.out.println(myTable.getType());


        //visitor Design Pattern 
        // Car[] cars = {new Ford(), new Ferrari()}; 
        // CarVisitor visitor = new CarServiceVisitor(); 

        // for(Car car: cars){
        //     car.accept(visitor);
        // }

        // Lab 7a 
        Person person = new Person(30, "Isaac", "John"); 
        Person person1 = new Person(17, "Packer", "Peter"); 
        Person person2 = new Person(22, "Jamie", "Kay"); 
        Person person3 = new Person(17, "Miles", "Mirales"); 

        // List<Person> people = new ArrayList<>(); 
        // people.add(person);
        // people.add(person1);
        // people.add(person2);
        // people.add(person1);

        // for(Person p : people){
        //     System.out.println(p.getFirstname() + " " + p.getSurname() + " " + p.getAge());
        // }
        
        // System.out.println();

        // Set<Person> newPeople = new HashSet<>(); 
        // newPeople.add(person);
        // newPeople.add(person1);
        // newPeople.add(person2);
        // newPeople.add(person1);

        // for(Person p : newPeople){
        //     System.out.println(p.getFirstname() + " " + p.getSurname() + " " + p.getAge());
        // }

        Map<String, Person> myMap = new HashMap<>(); 
        myMap.put("New-man", person);
        myMap.put("Spider-Man", person1);
        myMap.put("Black Panther", person2);
        myMap.put("New Comic Spider-Man", person3);
        

        for(String key : myMap.keySet()){
            Person p = myMap.get(key);
            //System.out.println(key + " " + p.getFirstname() + " " + p.getSurname());
            //System.out.println(key);
        }

        //System.out.println();

        Map<String, List<Person>> myMap1 = new HashMap<>(); 

        List<Person> people = new ArrayList<>(); 
        people.add(person3);
        people.add(person1);

        myMap1.put("Spider-Man", people) ;
        
        for(String key : myMap1.keySet()){
            List<Person> people2 = myMap1.get(key);
            for(Person p : people2){
                //System.out.println(key + " " + p.getFirstname() + " " + p.getSurname());
            }
            //System.out.println(key);
        }

        List<Person> people3 = new ArrayList<>(); 
        people3.add(person1); 
        people3.add(person2); 
        people3.add(person3);
        people3.add(person);

        //Collections.sort(people3);
        //people3.sort(new Person.PersonComparator());
        //  people3.forEach(System.out::println);

        for(Person p : people3){
            //System.out.println(p.getSurname() + " " + p.getFirstname() + " " + p.getAge());
        }

        // What you can do with the for Each functional interfaces 
        //people3.forEach(System.out::println); 
        // Using Streams
        System.out.println();
        List <Person> people4 = people3.stream().filter((p) -> p.getAge() > 17).collect(Collectors.toList()); 
        //people4.forEach(System.out::println); 
        

        /*Lab 8 */
        /*Try Catch */
        // Scanner input  = new Scanner(System.in); 

        // System.out.print("Enter a number: ");
        // String text = input.nextLine(); 
        // input.close();
        
        // try {
        //     int num = Integer.parseInt(text);
        //     int results = num*10; 
        //     System.out.println(num + " has been entered \n" + "results times 10  = " + results );
            
        // } catch (Exception e) {
        //     TODO: handle exception
        //     System.out.println(e.getMessage());
        //     System.out.println("That's not a number! Try Entering an Integer");
        // }
        
        
        //System.out.println("Thanks for using my program");

        /*Creating Files */
        // File myFile = new File("myFile.txt");
        
        // try {
        //     if(myFile.createNewFile()){
        //         System.out.println("File created");
        //     }else{
        //         System.out.println("File already exists");
        //     }
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        try(FileWriter fw = new FileWriter("anotherFile.txt"); BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("This is a message \n");
            bw.write("this is another message \n");
            bw.close();
            fw.close();
        }catch(IOException ex){
            System.out.println("An error occurred:" + ex.getMessage());
        }

        try(FileReader fr = new FileReader("anotherFile.txt"); BufferedReader br = new BufferedReader(fr)){

            String line = br.readLine(); 

            while(line != null){
                System.out.println(line);
                line = br.readLine(); 
            }
        }catch(IOException ex){
            System.out.println("An error occurred:" + ex.getMessage());
        }

        
       






    }
    //Stategy Pattern
    // public void printWords(PrintStrategy printStrategy){
    //     printStrategy.print(this.words);
        
    // }

    // public static void acceptAnimal(Animal animal){
    //     //System.out.println(animal.makeNoise());

        

    // }

    // public static void acceptFlyingThing(CanFly thing){
    //     thing.fly(); 
    // }

}