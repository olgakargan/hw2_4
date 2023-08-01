package hw11;

public class ThreadExample implements Runnable{
    public void run(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadExample());
        thread.start();
    }
}
