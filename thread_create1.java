public class thread_create1 extends Thread{
public void run(){
System.out.println("Thread is running");}
public static void main(String[] args){
thread_create1 thread1=new thread_create1();
thread_create1 thread2=new thread_create1();
thread_create1 thread3=new thread_create1();
thread1.start();
thread2.start();
thread3.start();
}}

