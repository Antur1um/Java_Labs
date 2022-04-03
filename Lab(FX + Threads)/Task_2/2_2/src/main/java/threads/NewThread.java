package threads;

public class NewThread extends Thread {
    private int counter;

    public NewThread(String name){
        super(name);
        System.out.println("Created: " + this);
        start();
    }

    public void run() {
        System.out.println(getName() + " Started ");
        try {
            while(true){
                System.out.println(" Count: " + counter);
                counter = counter + 1;
                sleep(1000);
            }

        }
        catch (InterruptedException e){
            System.out.println("Error in sleep");
        }
        catch (Exception e){
            System.out.println("Error");
        }


    }


    public String Get_Counter() {
        return String.valueOf(counter);
    }




}
