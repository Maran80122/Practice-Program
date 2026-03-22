package threading;




class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Sleep {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}
