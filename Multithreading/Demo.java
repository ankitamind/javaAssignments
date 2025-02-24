package LearnCoding.Multithreading;

class Demo implements Runnable {
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Hello");
            }
        }catch(Exception e){

        }
    }
}
class B {
    public static void main(String[] args)throws Exception {
        Demo obj=new Demo();
        Thread t=new Thread(obj);
        t.start();

        for(int i=1;i<=5;i++){
            System.out.println("Heyyy");
        }
    }
}