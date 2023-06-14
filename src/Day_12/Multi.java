package Day_12;

class Multi extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        Multi t1=new Multi();
        t1.start();
    }
}  