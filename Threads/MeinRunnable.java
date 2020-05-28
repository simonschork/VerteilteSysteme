public class MeinRunnable implements Runnable {

    public void run() {
        los();
    }

    public void los() {
        tuNochMehr();
    }

    public void tuNochMehr() {
        System.out.println("oben auf dem Stack");
    }
}