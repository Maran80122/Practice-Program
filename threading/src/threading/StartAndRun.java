package threading;


class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
        }
    }
}

public class StartAndRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MyThread t1 = new MyThread();
	        t1.start();  

	}

}


 
