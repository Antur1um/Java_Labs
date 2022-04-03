package threads;

public class NewThread implements Runnable {
    private Thread t;
    private int counter = 1000;

    public NewThread(String name){
        t = new Thread(this, name);
        t.start();
    }


    public void run() {
        System.out.println(t.getName() + " Started ");
        try {
            while(counter >= 1){
                System.out.println(t + " Count: " + counter);
                t.sleep(20);
                counter = counter - 1;
            }

        }
        catch (InterruptedException e){
            System.out.println("Error in sleep");
        }
        catch (Exception e){
            System.out.println("Error");
        }


    }


}
