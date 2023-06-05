abstract  class Department{
    public abstract int getDepartmentSize(int x);
}

public class Abstraction extends Department {

    public static void main(String[] args){
        Abstraction dep = new Abstraction();
        int val =dep.getDepartmentSize(10);
        System.out.println(val);
    }

    @Override
    public int getDepartmentSize(int x) {
        return x;
    }
}
