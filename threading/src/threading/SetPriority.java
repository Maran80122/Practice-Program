package threading;




class MyThread4 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName()+ ":"+i + " is running");
        }
    }
}

public class SetPriority {
    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4();
        MyThread4 t2 = new MyThread4();
        MyThread4 t3 = new MyThread4();

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
