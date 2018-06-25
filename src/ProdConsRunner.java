public class ProdConsRunner {

    public static void main(String args[]) {

        JobQueue jobQueue = new JobQueue();
        new Producer(jobQueue).start();
        new Consumer(jobQueue).start();
        new Consumer(jobQueue).start();
        new Consumer(jobQueue).start();
        new Consumer(jobQueue).start();
        new Consumer(jobQueue).start();
    }
}
