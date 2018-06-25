public class Consumer extends Thread {
    private JobQueue jobQueue;
    int iter = 0;
    public Consumer(JobQueue jobQueue) {
        this.jobQueue = jobQueue;
    }
    public void run() {
        while (true) {
            iter += 1;
            try {
                System.out.println(this.getName() + ": iter: " + iter + " job name: " + jobQueue.remove().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
