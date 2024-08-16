
// By extending Thread class

/*
class MyThread extends Thread {

    
        public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread name :" + Thread.currentThread().getName() + " , number :" + i);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }     
    }
}

public class Threading{
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        mt1.setName("A");
        mt2.setName("B");
        mt1.start();
        mt2.start();
    }
}

*/

// by implementing RUNNABLE interface

class MyThread implements Runnable {

    synchronized public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread name :" + Thread.currentThread().getName() + " , number :" + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // Handle the exception appropriately
                System.out.println(e);
            }
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        Thread mt1 = new Thread(new MyThread());
        Thread mt2 = new Thread(new MyThread());
        mt1.setName("A");
        mt2.setName("B");
        mt1.start();
        mt2.start();
    }
}