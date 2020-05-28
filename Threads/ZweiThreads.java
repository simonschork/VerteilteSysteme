public class ZweiThreads implements Runnable {

    public static void main(String[] args) {
        ZweiThreads aufgabe = new ZweiThreads();
        Thread alpha = new Thread(aufgabe);
        Thread beta = new Thread(aufgabe);
        alpha.setName("alpha");
        beta.setName("beta");
        alpha.start();
        beta.start();

    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                String threadName = Thread.currentThread().getName();
                System.out.println("jetzt läuft " + threadName);

                try {
                    notify();
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}