class Bird{
    public void sing(){
        System.out.println("tweet tweet tweet");
    }

}

class Pelican extends Bird{
    public void sing(){
        System.out.println("tweedle dee");
    }

}


public class Polymorphism {
    public static void main(String[] args){
        Pelican b = new Pelican();

        b.sing();
    }
}
