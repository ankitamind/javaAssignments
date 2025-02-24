package LearnCoding.Multithreading;

public class ThreadByImplementingDemo implements Runnable {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi Ankita");
        }
    }
}

class B{
    public static void main(String[] args) {
        ThreadByImplementingDemo obj=new ThreadByImplementingDemo();
        Thread t=new Thread(obj);
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println("Hello ...Aniket");
        }

    }
}
