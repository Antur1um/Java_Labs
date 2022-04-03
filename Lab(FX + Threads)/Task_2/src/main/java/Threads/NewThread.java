package Threads;

public class NewThread implements Runnable {
    private Thread t;
    private int counter = 0;

    public NewThread(String name){
        t = new Thread(this, name);
        t.start();
    }


    public String get_counter(){
        return String.valueOf(counter);
    }

    public void run() {
        System.out.println(t.getName() + " Started ");
        try {
            while(true){
                System.out.println(t + " Count: " + counter);
                counter = counter + 1;
                t.sleep(1000);
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


