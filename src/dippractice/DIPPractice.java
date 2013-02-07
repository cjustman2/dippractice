/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author chris
 */
public class DIPPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            iOutputStrategy out = new GuiOutputStrategy();
       // MessageService service = new MessageService(out);
        
        iInputStrategy in = new GuiInputStrategy();
      // MessageService servicein = new MessageService();
        
        //service.outputMessage();
        //servicein.inputMessage();
    }
}
