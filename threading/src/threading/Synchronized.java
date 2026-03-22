package threading;



	class Counter {
	    private int count = 0;

	    // synchronized method
	    public synchronized void increment() {
	        count++;
	    }

	    public int getCount() {
	        return count;
	    }
	}

	public class Synchronized {
	    public static void main(String[] args) throws InterruptedException {
	        Counter counter = new Counter();

	        Thread t1 = new ThreadClass(counter);
	        Thread t2 = new ThreadClass(counter);

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        System.out.println("Final Count: " + counter.getCount());
	    }
	}

	class ThreadClass extends Thread {
	    Counter counter;

	    ThreadClass(Counter counter) {
	        this.counter = counter;
	    }

	    public void run() {
	        for (int i = 0; i < 1000; i++) {
	            counter.increment();
	        }
	    }
	}

