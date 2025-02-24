package LearnCoding.Multithreading;
public class InterruptDemo extends Thread {
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Thread 1 is running");
                Thread.sleep(1000);
        }
        }
        catch(Exception e){
            System.out.println("Thread 1 is terminating");
        }
    }

}
class B{
    public static void main(String[] args) {
        InterruptDemo t1=new InterruptDemo();
        t1.start();
        t1.interrupt();
    }
}