/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author chris
 */
public class MessageService {
    private static final String message = "hello";
    private iOutputStrategy out;
    private iInputStrategy in;
    
    
    public MessageService(iInputStrategy in){
        this.in = in;
    }
    
      public void outputMessage(){
        out.outputMessage(message);
    }
      
  
      
    
      
    
}
