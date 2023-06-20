package Day16;

import java.util.ArrayList;

public class RemoveLastObject {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove(cars.size()-1);
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
