/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ConsoleInputStrategy implements iInputStrategy{
     private String inputMessage;
    
    @Override
   public String getMessage(){
       Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a message");
       inputMessage = keyboard.nextLine();
       return inputMessage;
   }  
    
}
