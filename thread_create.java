public class thread_create implements Runnable{
public void run(){
System.out.println("Thread is running");}

public static void main(String[] args){
thread_create t1=new thread_create();
Thread Thread1=new Thread(t1);
thread_create t2=new thread_create();
Thread Thread2=new Thread(t1);
thread_create t3=new thread_create();
Thread Thread3=new Thread(t1);
Thread1.start();
Thread2.start();
Thread3.start();
}
}