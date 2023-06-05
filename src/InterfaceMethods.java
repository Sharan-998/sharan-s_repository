interface Interface1{
    void sayHi();
}

interface Interface2{
    void sayBye();
}


public class InterfaceMethods implements Interface1, Interface2 {
    public static void main(String[] args){
        InterfaceMethods ex = new InterfaceMethods();

        ex.sayHi();
        ex.sayBye();
    }


    @Override
    public void sayHi() {
        System.out.println("Hi everyone");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye Y'all");
    }
}
