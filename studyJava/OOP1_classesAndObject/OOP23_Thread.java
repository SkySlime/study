// thread using class named Thread
public class OOP23_Thread extends Thread {
    public static void main(String[] args) {
        OOP23_Thread obj = new OOP23_Thread();
        obj.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}

