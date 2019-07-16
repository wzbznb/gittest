package wzb;

public class Demo 
{  
/*    public void test1() 
    {  
         synchronized(this) 
         {  
              int i = 5;  
              while( i-- > 0) 
              {  
                   System.out.println(Thread.currentThread().getName() + " : " + i);  
                   try 
                   {  
                        Thread.sleep(500);  
                   } 
                   catch (InterruptedException ie) 
                   {  
                   }  
              }  
         }  
    }  */
	
    public static synchronized String test1() 
    {  
         int i = 5;  
         while( i-- > 0) 
         {  
              System.out.println(Thread.currentThread().getName() + " : " + i);  
              try 
              {  
                   Thread.sleep(500);  
              } 
              catch (InterruptedException ie) 
              {  
              }  
         }  
         return "";
    }
    
    public static synchronized String test2() 
    {  
         int i = 5;  
         while( i-- > 0) 
         {  
              System.out.println(Thread.currentThread().getName() + " : " + i);  
              try 
              {  
                   Thread.sleep(500);  
              } 
              catch (InterruptedException ie) 
              {  
              }  
         }  
         return "";
    }  
    public static void main(String[] args) 
    {  
		final Demo myt2 = new Demo();
		final Demo myt3 = new Demo();
		Thread test1 = new Thread(new Runnable() {
			public void run() {
				myt2.test1();
			}
		}, "test1");
		Thread test2 = new Thread(new Runnable() {
			public void run() {
				myt3.test2();
			}
		}, "test2");
		test1.start();
		;
		test2.start();
//         TestRunnable tr=new TestRunnable();
//         Thread test3=new Thread(tr);
//         test3.start();
    } 
}
 