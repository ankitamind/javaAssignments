package LearnCoding.Multithreading;
public class ThreadByExtendingDemo  extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Hi");
                Thread.sleep(1000);
            }
        }catch(Exception e){

        }
    }
}
class B{
    public static void main(String[] args)throws Exception {
        ThreadByExtendingDemo t=new ThreadByExtendingDemo();
        t.start();

        for(int i=1;i<=5;i++){
            System.out.println("Anku");
            Thread.sleep(1000);
        }

    }
}
