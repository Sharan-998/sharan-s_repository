package Day_6;

public class Age {
    public static void main (String[] args){
        int age = 140;
        Age.findPerson(age);

    }

    public static  void findPerson(int age) {
        if(age>=13 && age<=19){
            System.out.println("teen");
        }else if( age <13){
            System.out.println("kid");
        }else{
            System.out.println("adult");
        }
    }

}
