package Threat;

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From MyRunnable: " + i);
            try {
                Thread.sleep(2000);  // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        Thread t1=new Thread(myRunnable);
        try {
        t.start();
    	t.join();
        System.out.println("Threads is alive"+t.isAlive());
        t1.start();
        }catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Main thread done starting MyRunnable!");
    }
}
