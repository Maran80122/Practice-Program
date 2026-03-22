package Threat;

public class JoinExample implements Runnable {
    private String name;

    public JoinExample(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " starting work...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
        }
        System.out.println(name + " finished work!");
    }

    public static void main(String[] args) {
    	
//    	JoinExample j1=new JoinExample("Worker-1");
//    	JoinExample j2=new JoinExample("Worker-2");
    	

    	Runnable j1=new JoinExample("Worker-1");
    	Runnable j2=new JoinExample("Worker-2");
    	
    	Thread thread1=new Thread(j1);
    	Thread thread2=new Thread(j2);
    	  thread1.start();
          thread2.start();
//   ------------------------------------------------ 	this is short form
//        Thread t1 = new Thread(new JoinExample("Worker-1"));
//        Thread t2 = new Thread(new JoinExample("Worker-2"));
          
//          t1.start();
//          t2.start();
      

        try {
            thread1.join();
            thread2.join();
//            
//            t1.join();
//            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread: All workers are done!");
    }
}
