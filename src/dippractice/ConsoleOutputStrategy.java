/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author chris
 */
public class ConsoleOutputStrategy implements iOutputStrategy {
    @Override
    public void outputMessage(String message){
        System.out.println(message);
    }
    
}
