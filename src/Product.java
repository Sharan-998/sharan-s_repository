public class Product {
    double price;

    public void setPrice(int x){
        this.price  = x;
    }

    public void getPrice(){
        System.out.println(this.price);
    }

    public void getPrice(int quantity){
        System.out.println(this.price*quantity);
    }




}
