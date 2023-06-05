package Overloaded_Constructors;

public class Puppy extends Dog{

    String name;
    Puppy(String breed, String name) {
        this.breed = breed;
        this.name = name;

    }
    Puppy(String name){
        this.name = name;
    }
}
