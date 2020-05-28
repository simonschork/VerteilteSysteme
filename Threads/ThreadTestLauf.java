public class ThreadTestLauf {

    public static void main(String[] args) {

        Runnable threadJob = new MeinRunnable();
        Thread meinThread = new Thread(threadJob);

        meinThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("zurück in main");
    }
}
