package com.app.service;

class Count2 implements Runnable
{
   Thread mythread ;
   Count2()
   { 
      mythread = new Thread(this, "my runnable thread");
      System.out.println("my thread created" + mythread);
      mythread.start();
   }
   public void run()
   {
      try
      {
        for (int i=0 ;i<10;i++)
        {
          System.out.println("Printing the count " + i);
          Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("my thread interrupted");
     }
     System.out.println("mythread run is over" );
   }
}
public class ThreadExample5
{
    public static void main(String args[])
    {
       Count2 cnt = new Count2();
       try
       {
          while(cnt.mythread.isAlive())
          {
            System.out.println("Main thread will be alive till the child thread is live"); 
            Thread.sleep(1500);
          }
       }
       catch(InterruptedException e)
       {
          System.out.println("Main thread interrupted");
       }
       System.out.println("Main thread run is over" );
    }
}