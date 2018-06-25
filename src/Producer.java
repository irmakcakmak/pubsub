public class Producer extends Thread {
    private final JobQueue jobQueue;
    private int count = 10000;
    private int upper = 131;
    private int lower = 10;

    public Producer(JobQueue jobQueue) {
        this.jobQueue = jobQueue;
    }

    @Override
    public void run() {
        int r = (int) (Math.random() * (upper - lower)) + lower;
        for (int i = 0; i < count; i++) {
            this.jobQueue.add(new Job(this.getName()));
            try {
                Thread.sleep(r);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
