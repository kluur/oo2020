public class MyThread implements Runnable {

    private Thread thread;
    private String threadName;

   
    public MyThread(String threadName, int inter) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {

                if (threadName == "Odd thread")
                { 
                    if (i % 2 == 0){
                        System.out.println("");
                    }
                    else{
                        System.out.println(threadName + ": " + i);
                        Thread.sleep(1000);
                    } 
                } else if(threadName == "Even thread"){
                    if (i % 2 != 0){
                        System.out.println("");
                    }
                    else{
                        System.out.println(threadName + ": " + i);
                        Thread.sleep(1000);
                    } 
                }else{
                    System.out.println("");
                }

            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " dead");
        }

    }

    public void start() {
        System.out.println("Thread " + threadName + " starting");
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

}