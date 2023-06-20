package Day16;

import java.util.ArrayList;
import java.util.List;

public class Student_LowGPA {
    public static  void main(String[] args) {
        List<Student_Class> list = new ArrayList<>();
        list.add(new Student_Class("Ron","S",3.4));
        list.add(new Student_Class("Andy","K",3.55));
        list.add(new Student_Class("Ruby","P",3.5));
        list.add(new Student_Class("Jon","Y",3.89));
        list.add(new Student_Class("Jones","B",3.15));

        double avg = 0;
        for (Student_Class s:list) {
            avg+=s.getGPA();
        }
        avg=avg/list.size();
        System.out.println("Avg" + avg);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGPA() < avg){
                list.remove(i);
            }
        }
        for (Student_Class s:list) {
            System.out.println(s);
        }


    }
}
