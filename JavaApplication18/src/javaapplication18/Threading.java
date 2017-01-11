
package javaapplication18;
class MyThread extends Thread{
    public void run(){
    
        System.out.println("this line Executed by " + Thread.currentThread().getName());
    
    }
    }
public class Threading {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
         System.out.println("this line Executed by " + Thread.currentThread().getName());
       // t.start();
    
      /*  for(int i=0;i<10;i++){
        System.out.println("MainThread "+i);
    }*/
    }
    
}
