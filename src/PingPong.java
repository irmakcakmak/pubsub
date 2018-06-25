public class PingPong {
    private String word;
    private String name;
    private int delay;

    public PingPong(String word, int delay) {
        this.word = word;
        this.delay = delay;
        Runnable service = new Runnable(){
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println("Name: " + word);
                        Thread.sleep(delay);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
        };
        new Thread(service).start();
    }

    public void run() {

    }

    public static void main(String[] args) {
        PingPong ping = new PingPong("ping", 100);
        PingPong pong = new PingPong("PONG", 150);
    }
}
