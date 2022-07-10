public class synchronize extends Thread{
static int availability=1;
public void run(){
if (availability>0){
availability--;
System.out.println("The product is booked:"+Thread.currentThread().getName());}
else{
System.out.println("The product is out of stock:"+Thread.currentThread().getName());}}
public static void main(String[] args){
synchronize Thread1=new synchronize();
synchronize Thread2=new synchronize();
synchronize Thread3=new synchronize();
synchronize Thread4=new synchronize();

Thread1.start();
Thread2.start();
Thread3.start();
Thread4.start();}}