package day25A;
// Java code for thread creation by extending the threading class

public class MultithreadingDemo1 extends Thread{
    public void run(){
        try{
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }catch (Exception e){
            System.out.println("Exception is caught");
        }
    }

}
