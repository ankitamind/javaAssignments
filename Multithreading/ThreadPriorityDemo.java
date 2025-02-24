package LearnCoding.Multithreading;
public class ThreadPriorityDemo  extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
class B{
    public static void main(String[] args) {
        ThreadPriorityDemo t1=new ThreadPriorityDemo();
        ThreadPriorityDemo t2=new ThreadPriorityDemo();
        ThreadPriorityDemo t3=new ThreadPriorityDemo();

        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");

        t1.setPriority(10);
        t2.setPriority(2);
        t3.setPriority(6);

        t1.start();
        t2.start();
        t3.start();
    }
}