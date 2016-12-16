package com.springCore.beanLifeCycle;

/**
 * Created by chetan on 16/12/16.
 */
public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
    //These are intialiaze and destroy method which are preferred than directly
    // using IntialiazingBean and DisbosableBean
   public void init(){
      System.out.println("Bean is going through init.");
   }
   public void destroy(){
      System.out.println("Bean will destroy now.");
   }
}