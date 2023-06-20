package Day16;

public class Student_Class {
    String first_name;
    String last_name;
    double GPA;

    Student_Class(String first_name, String last_name, double GPA){
        this.first_name = first_name;
        this.last_name = last_name;
        this.GPA = GPA;
    }
    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public double getGPA() {
        return GPA;
    }
    public String toString() {
        return this.first_name + " " + this.last_name + " " + this.GPA;
    }

}
