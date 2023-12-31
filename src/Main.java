import java.awt.Color;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import Tools.Toolbox;


public class Main {

// 2. VARIABLES
    public static void main2(String[] args) {

        System.out.println("Hello, World");  // println = "print line" adds newline char
        System.out.print("I love pizza\n");

        // Primitive (store data):
        //     DATA TYPE       SIZE        VALUE
        //     boolean         1 bit       true or false
        //     byte            1 byte      -128 to 127
        //     short           2 bytes     -32,768 to 32,767
        //     int             4 bytes     -2 billion to 2 billion
        //     long            8 bytes     -9 quitillion to 9 quitillion

        //     float           4 bytes     fractional number up to 6-7 digits
        //     double          8 bytes     fractional number up to 15 digits

        //     char            2 bytes     single character/letter/ASCII value

        // Reference (store address):
        //     String          varies      sequence of characters (String is a reference datatype, the others are primitive)

        
        int x; //declaration
        x = 10; //assignment
        int y = 20; //initialization

        System.out.println(x);
        
        x = 123; //reassignment
        
        System.out.println("The number is: " + x);

        long z = 123456789123456L; // must use suffix "L"

        float f = 3.14f; // float must use suffix "f"
        double g = 3.14;

        char symbol = '@';
        String name = "Bro";

        System.out.println("Hello " + name);
    }


// 4. USER INPUT
    public static void main4(String[] args) {
        // import java.util.Scanner;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("What is your favorite food?");
        scanner.nextLine(); // absorbs the \n from previous scanner
        String food = scanner.nextLine();
        
        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like to eat " + food);
    }   


// 5. EXPRESSIONS
    public static void main5(String[] args) {
        // expression = operands & operators
        // operands = values, variables, numnbers, quantity
        // operators = + - * / %

        int friends = 10;

        friends = friends + 1;
        friends += 1;
        friends++;

        // friends = (double) friends / 3; //casting to a different type

        System.out.println(friends);
    }


// 6. GUI INTRO
    public static void main6(String[] args) {
        //import javax.swing.JOptionPane;

        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt((JOptionPane.showInputDialog("Enter your age"))); // it outputs an string, need to convert to int
        double height = Double.parseDouble((JOptionPane.showInputDialog("Enter your height")));
        
        JOptionPane.showMessageDialog(null, "Hello " + name + "\n" + "You are " + age + " years old and " + height + " cm tall");
    }


// 7. MATH CLASS
    public static void main7(String[] args) {

        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);  // max min abs sqrt round ceil floor

        System.out.println(z);
        
        //hypotenuse exercise
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("The hypotenuse is "+z);

        scanner.close();
    }


// 8. RANDOM NUMBERS
    public static void main8(String[] args) {
        // import java.util.Random;
        
        Random random = new Random();

        int x = random.nextInt(6)+1; // 6 is exclusive; passing a value will limit the range of random integers generated
        double y = random.nextDouble(); // 0-1 float generated
        boolean z = random.nextBoolean();

        System.out.println(x);
    }


// 9. IF STATEMENTS
    public static void main9(String[] args) {
        int age = 18;

        if(age>=75) {
            System.out.println("Ok Boomer");
        }
        else if(age>=18) {
            System.out.println("You are an adult!");
        }
        else if (age>=13) {
            System.out.println("You are a teenager");
        }
        else {
            System.out.println("You are not an adult!");
        }
    }


// 10. SWITCHES
    public static void main10(String[] args) {
        int dayWeek = 2;
        String day = "";

        switch(dayWeek) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                System.out.println("This is not a valid week day");
        }
        System.out.println("Today is " + day);
    }


// 11. LOGICAL OPERATORS
    public static void main11(String[] args) {
        // && = AND   || = OR   ! = NOT
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("You are still playing the game");
        }
        scanner.close();
    }


// 12. WHILE LOOPS
    public static void main12(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name  = "";
        String name2 = "";

        while(name.isBlank()) {
            System.out.print("Enter your first name: ");
            name = scanner.nextLine();
        }
        
        // perform block of code at least once
        do {
            System.out.print("Enter your second name: ");
            name2 = scanner.nextLine();
        }while(name2.isBlank());
        
        System.out.println("Hello " + name);
        scanner.close();
    }


// 13. FOR LOOPS
    public static void main13(String[] args) {
        for(int i=0; i<10; i++) {
            System.out.println(i);
        }
    }


// 14. NESTED LOOPS
    public static void main14(String[] args) {
        int rows = 5;
        int cols = 5;
        String symbol = "*";

        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }


// 15. ARRAYS
    public static void main15(String[] args) {
        // must have same datatypes
        // pre assign
        String[] cars = {"Camaro", "Fusca", "Tesla"};
        cars[0] = "Mustang";
        int[] nums = {1,2,3,4};

        // pre alocate
        String[] fruits = new String[5];
        fruits[0] = "Apple";
        fruits[1] = "Lemon";

        for(int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }
    }


// 16. 2D ARRAYS (array of arrays)
    public static void main16(String[] args) {
        // pre assign
        String[][] cars = {
            {"Camaro", "Fusca"},
            {"Ferrari", "Corvette"}};
        // pre alocate
        String[][] cars2 = new String[2][2];
        cars2[0][0] = "Camaro";
        cars2[0][1] = "Fusca";
        cars2[1][0] = "Ferrari";
        cars2[1][1] = "Corvette";

        for(int i=0; i<cars2.length; i++) {
            for(int j=0; j<cars2[i].length; j++) {
                System.out.print(cars2[i][j] + " ");
            }
            System.out.println();
        }
    }


// 17. STRING METHODS
    public static void main17(String[] args) {
        String name      = "Bro";
        boolean compare  = name.equals("Bro");
        boolean compare2 = name.equalsIgnoreCase("Bro");
        int length       = name.length();
        char letter      = name.charAt(0);  // access letters
        int pos          = name.indexOf("B");
        boolean isEmpty  = name.isEmpty();  // isBlank() ignore spaces
        String upper     = name.toUpperCase();  // toLowerCase()
        String trimmed   = name.trim();  // remove trainling spaces
        String replaced  = name.replace('o', 'a');
    }


// 18. WRAPPER CLASS
    public static void main18(String[] args) {
        // provides a way to use primitive data types as reference data types
        // reference data types contain useful methods
        // can be used with collections (ex. ArrayList)
        // reference datatypes are slower than using primitive datatypes
        //
        // primitive    wrapper (reference)
        //--------      ---------
        // boolean      Boolean
        // char         Character
        // int          Integer
        // double       Double
        // ...
        // Strings are already datatypes

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their coresponding objects wrapper classes
        Boolean a = true;  // will allow a.methods()
        Character b = '$';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";
        
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
        if(a==true) {
            System.out.println("This is true");
        }
    }


// 19. ARRAY LIST
    public static void main19(String[] args) {
        // a resizable array
        // elements can be added and removed after compilation phase
        // only store reference data types, not primitives

        //import java.util.ArrayList;
        ArrayList<String> foods = new ArrayList<String>();
        foods.add("pizza");
        foods.add("burger");
        foods.add("hotdog");

        foods.set(3, "sushi");  // replace element to index i; can't create elements, must be in range
        foods.remove(2);  // remove element at index i
        foods.clear();  // remove everything

        for(int i=0; i<foods.size(); i++) {  // ArrayList.size() instead of String.length 
            System.out.println(foods.get(i));    // ArrayList.get(i) instaed of String[i]
        }
    }


// 20. 2D ARRAY LIST
    public static void main20(String[] args) {
        // a dynamic list of lists
        // can change size of these lists during runtime

        //import java.util.*; ?
        //import java.util.ArrayList;

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("donuts");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(0).get(0));
    }


// 21. FOR-EACH LOOPS
    public static void main21(String[] args) {
        // iterate through the elements in an array/collection
        // less steps, more readable
        // less flexible

        String[] animals = {"cat", "dog", "rat"};

        ArrayList<String> animals2 = new ArrayList<String>();

        animals2.add("cat");
        animals2.add("dog");
        animals2.add("rat");

        for(String i : animals) {  // : represents `in`
            System.out.println(i);
        }
    }


// 22. METHODS
    public static void main22(String[] args) {
        hello("Bro", 15);
    }
    static void hello(String name, int age) {
        // `static` is needed to call it from main()
        // a class is `private` by default
        // `void` returns null
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
    }
    

// 23. OVERLOAD METHODS
    public static void main23(String[] args) {
        // methods that share same name but have different parameters
        // method name + parameters = method signature
        int res = add(2,3,4,5); // will call third method
    }
    static int add(int a, int b) {
        System.out.println("Method #1");
        return a + b;
    }
    static int add(int a, int b, int c) {
        System.out.println("Method #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        System.out.println("Method #3");
        return a + b + c + d;
    }


// 24. PRINTF
    public static void main24(String[] args) {
        // optional method to control, format and disply texto to the console window
        // 2 arguments = format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]
        boolean myBool  = true;   // %b
        char myChar     = '@';    // %c
        String myString = "Bro";  // %s
        int myInt       = 123;    // %d (decimal)
        double myDouble = 3.1415; // %f (default is 6 decimal places)
        
        // [width]
        // minimum number of characters to be written as output
        // default pad with spaces right justify: `      Bro`
        // adding `-` left justify
        System.out.printf("Hello %10s %n", myString);  // %n newline (can also be `\n`)

        // [precision]
        // sets number of digits of precision when outputting floating-point value
        System.out.printf("Value is %.2f /n", myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus `+` or minus `-` sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 200
        System.out.printf("The value is %020f /n", myDouble);  // 20 length `zero` right-justify
    }


// 25. FINAL KEYWORD
    public static void main25(String[] args) {
        // cannot be changed or updated in the future (const?)
        final double PI = 3.14159;
    }


// 26. OBJECTS (OOP)
    public static void main26(String[] args) {
        // Car.java file
        Car car = new Car();
        car.drive();
    }


// 27. CONSTRUCTORS
    public static void main27(String[] args) {
        // special method that is called when an object is instantiated
        // Human.java file

        Human human1 = new Human("Bro", 12, 70);
        Human human2 = new Human("Rick", 65, 90);

        System.out.println(human1.name);
        human1.eat();
        human2.drink();
    }


// 28. VARIABLE SCOPES
    public static void main28(String[] args) {
        // local = declared inside a method; visible only to that method
        // global = declared outside a method but within a class; visible to all parts of a class

        //DiceRoller.java file
        DiceRoller diceRoller = new DiceRoller();
    }


// 29. OVERLOADED CONSTRUCTORS
    public static void main29(String[] args) {
        // multiple constructos within a class with the same name but with different parameters
        // name + parameters = signature

        // Pizza.java file
        Pizza pizza1 = new Pizza("crust");
        Pizza pizza2 = new Pizza("crust", "tomate");
        Pizza pizza3 = new Pizza("crust", "tomate", "mozzarella");
    }


// 30. toString BUILT-IN METHOD  
    public static void main30(String[] args) {
        // toString() = special method that all objects inherit,
        // returns a string that "textually represents" an object
        // can be used both implicity and explicity

        // Car.java file
        Car car = new Car();

        // print overriden toString() method
        // explicity
        System.out.println(car.toString());  // default soString implementation is Class@memoryAddress

        // implicity, same result
        System.out.println(car);
    }


// 31. ARRAY OF OBJECTS
    public static void main31(String[] args) {

        class Food {
            String name;
            Food(String name) {
                this.name = name;
            }
        }
        
        Food food1 = new Food("pizza");
        Food food2 = new Food("burger");
        Food food3 = new Food("sushi");
        
        // post assigning
        Food[] refrigerator = new Food[3];
        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;
        
        // pre assigning
        Food[] refrigerator2 = {food1, food2, food3};
    }


// 32. PASSING OBJECT AS ARGUMENT
    public static void main32(String[] args) {

        class Garage {
            void park(Car car) {
                System.out.println("The " + car.name + " is parked");
            }
        }

        Garage garage = new Garage();
        
        // Car.java file
        Car car1 = new Car("Fusca");
        Car car2 = new Car("Tesla");

        garage.park(car1);
        garage.park(car2);
    }


// 33. STATIC KEYWORD
    public static void main33(String[] args) {
        // static = modifier. A single copy of a variable/,ethod is created and shared
        // the class "owns" the static member
        
        class Friend {
            String name;
            static int numberOfFriends;
            Friend(String name) {
                this.name = name;
                numberOfFriends++;
            }
            static void displayFriends() {
                System.out.println("You have " + numberOfFriends + " friends");
            }
        }

        Friend friend1 = new Friend("Bro");  // will increment numberOfFriends for Class and all objects
        Friend friend2 = new Friend("Patrick");

        System.out.println(Friend.numberOfFriends);  // access attribute without instantiate object
        System.out.println(friend1.numberOfFriends);  // access through object; possible but NOT recommended

        Friend.displayFriends();  // access static method without instantiate

        Math.round(3);  // example of static built-in method
    }


// 34. INHERITANCE
    public static void main34(String[] args) {
        // the process where one class acquires attributes and methods of another

        // super/parent class
        class Vehicle {
            double speed;
            void go() {
                System.out.println("This vehicle is moving");
            }
            void stop() {
                System.out.println("This vehicle is stopped");
            }
        }

        // sub/child class
        class Car extends Vehicle {
            int doors = 4;
        }
        
        // sub/child class
        class Bike extends Vehicle {
            int pedals = 2;
        }

        Car car = new Car();
        car.go();

        Bike bike = new Bike();
        bike.stop();

        bike.speed = 10;
        System.out.println(bike.speed);
    }


// 35. METHOD OVERRIDING
    public static void main35(String[] args) {
        // declaring a method in sub class which is already present in parent class
        // done so that a child class can give its own implementation

        class Animal {
            void speak() {
                System.out.println("This animal speaks");
            }
        }
        
        class Dog extends Animal {
            @Override  // optional, good practice
            void speak() {
                System.out.println("This dog barks");
            }
        }

        Dog dog = new Dog();
        dog.speak();  // bark
    }


// 36. SUPER KEYWORD
    public static void main36(String[] args) {
        // keyword refers to the superclass (parent) of an object
        // very similar to the `this` keyword

        class Person {
            String name;
            int age;
            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
            public String printInfo() {
                return this.name;
            }
        }
        
        class Hero extends Person {
            String power;
            Hero(String name, int age, String power) {
                // invoking super constructor's attributes
                super(name, age);
                this.power = power;
            }
            public String printInfo() {
                // invoking super method
                return super.printInfo() + " has power " + this.power;
            }
        }

        Hero hero1 = new Hero("Batman", 42, "money");
        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);

        System.out.println(hero1.printInfo());
    }


// 37. ABSTRACTION
    public static void main37(String[] args) {
        // astract classes cannot be instantiated, but they can have a subclass
        // abstract methods are declared without an implementation
        // add layer of security

        abstract class Vehicle {
            // abstract method
            // can't have a body; forces its implementation in child classes
            abstract void go();
        }

        class Car extends Vehicle {
            @Override
            void go() {
                System.out.println("This car is driving");
            }
        }

        // Vehicle vehicle = new Vehicle(); // forbidden
        Car car = new Car();
        car.go();
    }


// 38. ACCESS MODIFIERS
    public static void main38(String[] args) {
        /*
        check .screens/access_levels.jpg
            public
            protected
            <no modifier>
            private
        */
    }


// 39. ENCAPSULATION
    public static void main39(String[] args) {
        /*
        atributes of a class will be hidden or private,
        can be accessed only through methods (getters & setters)
        you should make atrtibutes private if you don't have a reason to make them public/protected
        */
        
        class Dog {
            private String race;
            private int age;
        
            Dog(String race, int age) {
                this.race = race;
                this.age = age;
            }
        
            // getter
            public String getRace() {
                return race;
            }
            // setter
            public void setRace(String race) {
                this.race = race;
            }
        }

        
    }


// 40. COPY OBJECTS
    public static void main40(String[] args) {
        // import Car.java
        Car car1 = new Car("Chev", "Camaro");
        Car car2 = new Car("Volks", "Fusca");

        // car2 = car1;  // wrong way: will have same memory address
        car2.copy(car1);  // copy after instantiate; must implement copy method in class Car

        Car car3 = new Car(car1);  // copy before instantiate; must implement copy constructor that calls previous copy in class Car
    }


// 41. INTERFACE
    public static void main41(String[] args) {
        /*
        a template that can be applied to a class
        a special type of class that only contains abstract methods
        similar to inheritance, but specifies what a class has/must do
        classes can apply more than one interface, inheritance is limited to 1 super
        */

        interface Prey {
            void flee();  // abstract methods cannot have a body
        }

        interface Predator {
            void hunt();
        }

        class Rabbit implements Prey {
            @Override
            public void flee() {
                System.out.println("The rabbit is fleeing");
            }
        }

        class Fish implements Prey, Predator {
            @Override
            public void hunt() {
                System.out.println("This fish is hunting smaller fish");
            }
            @Override
            public void flee() {
                System.out.println("This fish is fleeing from a larger fish");
            }
        }

        class Hawk implements Predator {
            @Override
            public void hunt() {
                System.out.println("The hawk is hunting");
            }
        }
    }


// 42. POLYMORPHISM
    public static void main42(String[] args) {
        /*
        many - forms
        the ability of an object to identify as more than one type
        */
        class Vehicle {
            public void go() {
            }
        }

        class Bike extends Vehicle {
            @Override
            public void go() {
                System.out.println("the bike begins moving");
            }
        }
        
        class Boat extends Vehicle {
            @Override
            public void go() {
                System.out.println("the boat begins moving");
            }
        }

        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] racers = {bike, boat};

        for(Vehicle x : racers) {
            x.go();
        }
    }


// 43. DYNAMIC POLYMORPHISM
    public static void main43(String[] args) {
        // polymorphism after compilation (during runtime)
        
        class Animal {
            public void speak() {
                System.out.println("animal goes brrr");
            }
        }

        class Dog extends Animal {
            @Override
            public void speak() {
                System.out.println("dog goes bark");                
            }
        }

        class Cat extends Animal {
            @Override
            public void speak() {
                System.out.println("cat goes meow");                
            }
        }

        Scanner scanner = new Scanner(System.in);
        
        Animal animal;

        System.out.println("What animal do you want?\n[1=dog 2=cat]: ");
        int choice = scanner.nextInt();

        if(choice==1) {
            animal = new Dog();
        }
        else if(choice==2) {
            animal = new Cat();
        }
        else {
            animal = new Animal();
        }
        
        animal.speak();

        scanner.close();
    }


// 44. EXCEPTION HANDLING
    public static void main44(String[] args) {
        /*
        an event that occurs during execution of a program
        that disrupts the normal flow of instructions
        */
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to divide by: ");
            int x = scanner.nextInt();
            
            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: " + z);
        }

        catch(ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }

        catch(InputMismatchException e) {
            System.out.println("Please enter a valid number");
        }

        // catch all Exceptions
        catch(Exception e) {
            System.out.println("Some error occured");
        }

        // always execute
        finally {
            System.out.println("This is always print");
            scanner.close();
        }
    }


// 45. FILE CLASS
    public static void main45(String[] args) {
        // import java.io.File;
        // an abstract representation of file and directory path names

        File file = new File("files/secret_message.txt");  // can use `\\` or `/`

        if(file.exists()) {
            System.out.println("That file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete();
        } else {
            System.out.println("That file does not exist");
        }
    }


// 46. FILE WRITER
    public static void main46(String[] args) {
        // import java.io.FileWriter;
        try {
            FileWriter writer = new FileWriter("files/poem.txt");
            writer.write("Roses are red\nViolets are blue\n");  // override
            writer.append("\n(A poem by Bro)");
            
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


// 47. FILE READER
    public static void main47(String[] args) {
        /*
        read the contents of a file as a stream of characters. One by one
        read() returns an int value which contains the byte value
        when read() returns -1, there is no more data to be read
        */

        // import java.io.FileReader;
        try {
            FileReader reader = new FileReader("files/poem.txt");
            int data = reader.read();
            while(data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


// 48. AUDIO
    public static void main48(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // import javax.sound.sampled.*;

        Scanner scanner = new Scanner(System.in);
        
        File file = new File("./media/sound.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        // clip.start();  // won't play unless the execution is hanged

        // audio play would be interrupted by the end of program
        // workaround to wait for an input, so audio will play meanwhile
        String response;

        do {
            System.out.println("P = play, S = stop, R = reset, Q = quit");
            System.out.println("Enter your choice: ");
            
            response = scanner.next();
            response = response.toUpperCase();

            switch(response) {
                case "P":
                    clip.start();
                    break;
                case "S":
                    clip.stop();
                    break;
                case "R":
                    clip.setMicrosecondPosition(0);
                    break;
                case "Q":
                    clip.close();
                    break;
                default:
                    System.out.println("Not a valid response");
            }
        } while(!response.equalsIgnoreCase("Q"));
        System.out.println("Bye");
    }


// ... 49-73: SKIPPED GUI VIDEOS AND JUMPED TO t=36916 ; Check GUI codes in `Java GUI` folder


// 74. GENERICS
    public static void main74(String[] args) {
        // enable types (classes and interfaces) to be parameters when defining:
        // classes, interfaces and methods
        // a benefit is to eliminate the need to create multiple versions
        // of methods or classes for various date types
        // Use 1 version for all reference data types


        // --> calling generic methods to print array elements
        Integer[] intArray = {1,2,3,4,5};
        String[] stringArray = {"H", "E", "L", "L", "O"};

        displayArray(intArray);
        displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(stringArray));

        // --> calling generic classes with 1 datatype (must inform the type regardless)
        MyGenericClass<Integer> myInt = new MyGenericClass<>(5);
        MyGenericClass<String> myStr = new MyGenericClass<>("Hello");

        // it is very similar to ArrayList call
        ArrayList<String> myFriends = new ArrayList<>();

        // --> calling generic classes with differents data types
        MyGenericClass2<String, Character> myStr2 = new MyGenericClass2<>("Hello", 'a');

        // which is very similar to HashMap (key, value pairs, similar to python dictionary?)
        HashMap<Integer, String> users = new HashMap<>();

        // calling generic classes with bounded types
        MyGenericClass3<Integer, Double> myNum = new MyGenericClass3<>(125, 9.0);
    }
    
        // GENERIC METHODS
        // `T` is a convention but can be any name
        // ex.: make a method to print all elements of array of different types
        public static <T> void displayArray(T[] array) {
            for(T x : array) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        // method that return some generic
        public static <T> T getFirst(T[] array) {
            return array[0];
            
            /*
            // ex.: a more practical scenario like a game rendering
            Player player = new Player();
            Enemy enemy = new Enemy();
            Tree tree = new Tree();
            
            draw(player);
            draw(enemy);
            draw(tree);
            
            public static <T> void draw(T x) {
                x.draw();
            }
            */
        }


        // GENERIC CLASSES
        // generic class with 1 type
        public static class MyGenericClass <T> {
            T x;

            MyGenericClass(T x) {
                this.x = x;
            }

            public T getValue() {
                return x;
            }
        }

        // generic class with 2 types
        public static class MyGenericClass2 <T, V> {
            T x;
            V y;  // V is a convention for second data type?

            MyGenericClass2(T x, V y) {
                this.x = x;
                this.y = y;
            }

            public T getValue() {
                return x;
            }
        }

        // BOUNDED TYPES
        // you can create the objects of a generic class
        // to have data of specific derived types
        // ex. Number
        // so you can pass any reference datatype as long it's a Number subclass
        public static class MyGenericClass3 <T extends Number, V extends Number> {
            T x;
            V y;  // V is a convention for second data type?

            MyGenericClass3(T x, V y) {
                this.x = x;
                this.y = y;
            }

            public T getValue() {
                return x;
            }
        }


// 75. SERIALIZATION
    public static void main75(String[] args) throws IOException, ClassNotFoundException {
        // Serialization:
        //   the process of converting an object into a byte stream
        //   persists (saves the state) the object adter program exits
        //   this byte stream can be saved as a file or sent over a network
        //   can be sent to a different machine
        //   byte stream can be saved as a file (.ser) which is platform independent
        //   * think of this as if you're saving a file with the object's information

        // Deserialization:
        //   the reverse process of converting a byte stream into an object
        //   * think of this as if you're loading a saved file

        // Steps to Serialize:
        //   1. Your object class should implement Serializable interface
        //   2. add import java.io.Serializable;
        //   3. FileOutputStream fileOut = new FileOutputStream(file path);
        //   4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //   5. out.writeObject(objectName);
        //   6. out.close(); fileOut.close();

        // Steps do Deserialize:
        //   1. Declare your object (don't instantate)
        //   2. Your class should implement Serializable interface
        //   3. add import java.io.Serializable;
        //   4. FileInputStream fileIn = new FileInputStream(file path);
        //   5. ObjectInputStream in = new ObjectInputStream(fileIn);
        //   6. objectNam = (Class) in.readObject();
        //   7. in.close(); fileIn.close();

        // Important notes:
        //   1. children classes of a parent class that implements Serializable will do so as well
        //   2. static fields are not serialized (they belong to the class, not an individual object)
        //   3. the class's definition ("class file") itself is not recorded, cast it as the object type
        //   4. Fields declared as "transient" aren't serialized, they're ignored
        //   5. serialVersionUID is a unique version ID for a class that is serialible

        // serialVersionUID:
        // is a unique ID that functions like a version number
        // verifies that the sender and receiver of a serialized object have loaded classes for that object that match
        // Ensures object will be compatible between machines
        // Number must match. Otherwise this will cause an InvalidClassException
        // A serialVersionUID will be calculated based on class properties, members, etc
        // A serializable class can declare its own serialVersionUID explicitly (recommended)


        class User implements Serializable {

            private static final long serialVersionUID = 1;  // explicity UID declaration
            String name;
            transient String password;  // `transient` means the value will be ignore in serialization

            public void sayHello() {
                System.out.println("Hello " + name);
            }
        }

        // Serialization
        User userS = new User();
        userS.name = "Bro Code";
        userS.password = "password12345";

        FileOutputStream fileOut = new FileOutputStream("files/UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(userS);
        out.close();
        fileOut.close();

        System.out.println("object info saved!");

        long serialVersionUID = ObjectStreamClass.lookup(userS.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

        // Deserialization
        User userD = null;
        FileInputStream fileIn = new FileInputStream("files/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        userD = (User) in.readObject();  // needs casting
        in.close();
        fileIn.close();

        System.out.println(userD.name);
        System.out.println(userD.password);
        userD.sayHello();
    }


    // TimerTask
    public static void main76(String[] args) {
        // Timer:
        //   a facility for threads to schedule tasks
        //   for future execution in a background thread

        // TimerTask:
        //   a task that can be scheduled for one-time
        //   or repreated execution by a Timer

        // import java.util.Timer;
        Timer timer = new Timer();
        
        // import java.util.TimerTask;
        TimerTask task = new TimerTask() {

            int counter = 10;

            @Override
            public void run() {
                if (counter>0) {
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else {
                    System.out.println("Happy new year!");
                    timer.cancel();
                }
            }
        };

        // run the task within delay
        // timer.schedule(task, 3000);  // second argument is the delay, can be in ms, date, etc
        
        // import java.util.Calendar;
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2024);
        date.set(Calendar.MONTH, Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH, 31);
        date.set(Calendar.HOUR_OF_DAY, 23);
        date.set(Calendar.MINUTE, 59);
        date.set(Calendar.SECOND, 50);
        date.set(Calendar.MILLISECOND, 0);
        
        // run the task in certain date
        // timer.schedule(task, date.getTime());

        // repeat a task at every interval
        // timer.scheduleAtFixedRate(task, 0, 1000);  // run task with 0 delay, at every 1 second
        
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);  // run task from date, at every 1 second
    }


    // THREADS
    public static void main77(String[] args) {
        // threads = a thread of execution in a program (kind of like a virtual CPU)
        // The JVM allows an application to have multiple threads running concurrently
        // Each thread can execute parts of your code in parallel with the main thread
        // Each thread has a priority
        // Threads with higher priority are executed in preference compared to threads with a lower priority

        // The JVM continues to execute threads until either one of the following occurs:
        //     1. The exit method of class Runtime has been called
        //     2. all user threads have died

        // When a JVM starts up, there is a thread which calls the main method
        // This thread is called "main"

        // Daemon thread (opposite of user thread) is a low priority thread that runs in background to perform tasks such as garbage collection
        // JVM terminates itself when all user threads (non-daemon thread) finish their execution

        /*
        // check how many threads are running
        System.out.println(Thread.activeCount());

        // rename thread
        Thread.currentThread().setName("MyThread");

        // name of the main thread
        System.out.println(Thread.currentThread().getName());

        // change thread priority (1-10)
        Thread.currentThread().setPriority(7);
        
        // get the thread priority (1-10)
        System.out.println(Thread.currentThread().getPriority());

        // check if thread is alive
        System.out.println(Thread.currentThread().isAlive());
        */

        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println("This thread is running");
            }
        }

        MyThread thread2 = new MyThread();
        System.out.println(thread2.isDaemon());  // false (default)
        thread2.setDaemon(true);

        thread2.start();
        System.out.println(thread2.isAlive());

        System.out.println(thread2.getName());  // Thread-0
        thread2.setName("second thread");

        System.out.println(thread2.getPriority());  // 5 (default)
        thread2.setPriority(9);
    }


    // MULTI-THREADING
    public static void main78(String[] args) throws InterruptedException {
        // Process of execution multiple thread simultaneously
        // Helps maximum utilization of CPU
        // Threads are independent, they don't affect the execution of other threads
        // An execption inone thread will not interrupt other threads
        // useful for serving multuple clients, multiplayer games, or other mutually independent tasks

        class S {
            static void sleep(long ms) {
                try {
                    Thread.sleep(ms);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // first way to create a Thread class
        class MyThread extends Thread {
            @Override
            public void run() {
                for(int i=10; i>=0; i--) {
                    System.out.println("thread #1: " + i);
                    S.sleep(1000);
                }
                System.out.println("Thread number 1 is finished");
            }
        }
        
        // second way to create a Thread class
        // use a class or subclass that implements Runnable interface)
        // the benefit is you can still `extends` another Class
        class MyRunnable implements Runnable {
            @Override
            public void run() {
                for(int i=0; i<=10; i++) {
                    System.out.println("thread #2: " + i);
                    S.sleep(1000);
                }
                System.out.println("Thread number 2 is finished");
            }
        }

        // first way to create a Thread class
        MyThread thread1 = new MyThread();
        // second way to create a Thread class
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        // making them daemon will stop the execution when facing an error
        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        // make main thread wait 3000 ms to start.
        // if no interval is set it will wait until thread1 is finished
        thread1.join(3000);
        thread2.start();

        // force error
        System.out.println(1/0);
    }


    // PACKAGES
    public static void main79(String[] args) {
        // import Tools.Toolbox;
        Toolbox toolbox = new Toolbox();
    }


    // COMPILE/RUN WITH PROMPT
    public static void main80(String[] args) {
        
    }

    // EXECUTABLE .JAR
    public static void main81(String[] args) {
        
    }
}
