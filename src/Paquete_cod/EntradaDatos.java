
package Paquete_cod;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class EntradaDatos {

    
  public int introducir (int opcion){
    int num;
      switch(opcion){
 
       case 0:
          System.out.println("introduce el dato");          
          Scanner scan=new Scanner(System.in);
          num= scan.nextInt();
          break;
       case 1:
      
      
         String respuesta =JOptionPane.showInputDialog("introducir los datos");
          num=Integer.parseInt(respuesta);
          break;
  
       default:
        
        JOptionPane.showInputDialog("error, elige o 0 o 1",JOptionPane.WARNING_MESSAGE);
   
   }
      return opcion;
           
}

}