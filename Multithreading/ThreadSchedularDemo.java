package LearnCoding.Multithreading;
public class ThreadSchedularDemo extends Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        for(int i=1;i<3;i++){
            System.out.println(name);
        }
    }
}

class B{
    public static void main(String[] args) {
        ThreadSchedularDemo t1=new ThreadSchedularDemo();
        ThreadSchedularDemo t2=new ThreadSchedularDemo();
        ThreadSchedularDemo t3=new ThreadSchedularDemo();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");


        t1.start();
        t2.start();
        t3.start();
    }
 }
