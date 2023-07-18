public class ThreadPriorities implements Runnable {
//    public class ThreadPriorities extends Thread{
    // public void run() {
    //     System.out.println("Thread is running");
    // }

    // public static void main(String[] args) {
    //     ThreadPriorities ob = new ThreadPriorities();
    //     ob.start();
    // }
    public void run(){
        System.out.println("Thread is running using interface");
    }
    public static void main(String[] args) {
        Thread t=new Thread(new ThreadPriorities());
        t.start();
    }
}
