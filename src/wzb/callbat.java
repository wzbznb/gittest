package wzb;


import java.io.IOException;
import java.io.InputStream;
 
public class callbat {
  
  
      public static void main(String args[]){
         callCmd("E:/run.bat");
      }
      public static void  callCmd(String locationCmd){
          try {
          Process child = Runtime.getRuntime().exec(locationCmd);
          InputStream in = child.getInputStream();
          int c;
          while ((c = in.read()) != -1) {
              System.out.println((char)c);
      }
       in.close();
       try {
           child.waitFor();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println("done");
     } catch (IOException e) {
           e.printStackTrace();
     }
 }
 }
