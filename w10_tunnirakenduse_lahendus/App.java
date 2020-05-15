public class App {
    public static void main(String[] args) throws Exception {
        MyThread myThread1 = new MyThread("Even thread", 1000);
        MyThread myThread2 = new MyThread("Odd thread", 600);
        myThread1.start();
        myThread2.start();
    }
}