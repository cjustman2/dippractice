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
    //private static final String message;
    private iOutputStrategy out;
    private iInputStrategy in;
    
    
    public MessageService(iOutputStrategy out, iInputStrategy in){
        this.out = out;
        this.in = in;
    }
    
      public void outputMessage(){
        out.outputMessage(in.getMessage());
    }
      
  
      
    
      
    
}
