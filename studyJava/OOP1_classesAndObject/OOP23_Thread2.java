public class OOP23_Thread2 implements Runnable{

    public static void main(String[] args) {
        OOP23_Thread2 obj = new OOP23_Thread2();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }

}