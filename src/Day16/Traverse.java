package Day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Traverse {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("Roy");
            list.add("Mike");
            list.add("Ali");



            for (int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }

            System.out.println("enhanced for");
            for (String s : list) {
                System.out.println(s);
            }

            System.out.println("Iterator");
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

            System.out.println("parallel stream");
            list.parallelStream().forEach(System.out::println);


        }
}
