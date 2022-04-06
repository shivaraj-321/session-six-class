package day25A;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thank you");
//        while (true){
//            System.out.println("I am a thread");
//        }
    }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Shiv");
        MyThr t2 = new MyThr("Aman");
        t.start();
        t2.start();
        System.out.println("The id of the thread: "+ t.getId());
        System.out.println("The id of the thread: "+ t2.getId());
        System.out.println("The name of the thread: "+ t.getName());
        System.out.println("The name of the thread: "+ t2.getName());
    }
}
