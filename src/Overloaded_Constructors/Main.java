package Overloaded_Constructors;

public class Main {
    public static void main(String[] args){
        Puppy husky = new Puppy("bahu");

        Puppy chihuahua = new Puppy("chihuahua","Balla");

        System.out.println(husky.name);
        System.out.println(chihuahua.breed);
        System.out.println(chihuahua.name);
    }

}
