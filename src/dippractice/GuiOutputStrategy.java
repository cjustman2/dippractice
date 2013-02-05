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
public class GuiOutputStrategy implements iOutputStrategy {
    @Override
    public void outputMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
}
