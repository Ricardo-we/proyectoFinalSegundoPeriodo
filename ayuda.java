
package terminal;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class ayuda {
    Terminal t = new Terminal();
    Scanner scn = new Scanner(System.in);
     
    public ayuda(){ 
 
         System.out.println("Tienes estas opciones para elegir");
         System.out.println(Terminal.ordenesBasicas);
         System.out.println("Existe algún error?? aquí si o no");
         String mom = scn.nextLine();
         
                 
     }
}
