public class tr extends Thread {
    public void run() {
        System.out.println("Thread is Created and Running...");
    }

    public static void main(String args[]) {
        tr thread1 = new tr();
        thread1.start();

        thread1.setName("First Thread");
        System.out.println("Thread Name is : " + thread1.getName()); // GETTING NAME


        thread1.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY can be changed
        System.out.println("Thread Priority is : " + thread1.getPriority()); 

        // MAKING THREAD SLEEP FOR 2.5 SECONDS
        try {
            Thread.sleep(2500);
        }
        catch (InterruptedException e) {
            System.out.println("Error occured!!");
        }

        // STATUS OF THE THREAD created by us
        System.out.println("State of the Thread : " + thread1.getState());

        System.out.println("State of the CURRENT Thread : " + Thread.currentThread().getState());
    }
}