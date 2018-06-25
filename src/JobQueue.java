import java.util.concurrent.LinkedBlockingQueue;

public class JobQueue {
    private LinkedBlockingQueue<Job> jobQueue = new LinkedBlockingQueue<>();

    public synchronized void add(Job j) {
        jobQueue.add(j);
        notifyAll();
    }

    public synchronized Job remove() throws InterruptedException {
        while (jobQueue.size() == 0) {
            wait();
        }
        return jobQueue.remove();
    }
}
