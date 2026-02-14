class Mythread extends Thread {
    public void run() {
        for(int i=1 ; i<=50; i++){
            System.out.println(i);
        }
    }
}

class MyRunnable implements Runnable{
    public void run(){
        for(int i=51 ; i<=100; i++){
            System.out.println(i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException  {
       Mythread t1 = new Mythread();
       MyRunnable t2 = new MyRunnable();
       t1.start();
       Thread t3 = new Thread(t2);
       t3.start();

       t1.join();
       t3.join();
    }
}