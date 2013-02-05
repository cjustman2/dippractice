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
    private String input;
    
    
    @Override
    public String inputMessage(){
        input = JOptionPane.showInputDialog("Message?");
        return input;
    }
  
    
}
