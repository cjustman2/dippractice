/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class GuiInputStrategy implements iInputStrategy{
    private String inputMessage;
    
    @Override
   public void InputMessage(String inputMessage){
        inputMessage = JOptionPane.showInputDialog("Message?");
   }  
    
  
    
}
