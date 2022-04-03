
public class Main{
    public static void main(String args[]){

        Synchronizer sync = new Synchronizer();
        new Threads(1, sync);
        new Threads(2, sync);
    }
}

class Synchronizer{
    boolean change = false;
    synchronized void ChangeThreads(int n){
        if (n == 1) {
            while(change) {
                try {
                    wait();
                } 
                catch (InterruptedException e) {
                    System.out.println("Error!");
                }
             }
             System.out.println(Thread.currentThread().getName());
            change = true;
            notify();
            }

        else if (n == 2){
            while(!change) {
                try {
                    wait();
                } 
                catch (InterruptedException e) {
                    System.out.println("Error!");
                }
            }
            System.out.println(Thread.currentThread().getName());
            change = false;
            notify();
        }

    }

}

class Threads implements Runnable{
    Thread t;
    Synchronizer data;
    int id;
    
    Threads(int new_id, Synchronizer new_data){
        id = new_id;
        this.data = new_data;
        t = new Thread(this, "thread" + id);
        System.out. println("New thread created " + t);
        t.start();
    }

    public void run(){
        while(true){
            try {
                data.ChangeThreads(id);
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
                System.out.println("Thread stopped");
            }
        }
    }
}



   





