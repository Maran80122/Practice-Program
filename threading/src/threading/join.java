package threading;




class MyThread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class join {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();

        t1.start();
        try {
            t1.join();   // ✅ main waits until t1 finishes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
    }
}
