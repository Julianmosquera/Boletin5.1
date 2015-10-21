
package boletin5.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author julianlinux
 */
public class Boletin51 {

    
    public static void main(String[] args) {
       Coche primerCoche=new Coche();
       JOptionPane.showMessageDialog(null,"La velocidad incial es: "+primerCoche.getVelocidade());
       String acelerarrespuesta=JOptionPane.showInputDialog("Teclea la velocidad de aceleracion");
       primerCoche.acelerar(Integer.parseInt(acelerarrespuesta));
       JOptionPane.showMessageDialog(null,"La velocidad tras acelerar es de: "+primerCoche.getVelocidade());
       String frenarrespuesta=JOptionPane.showInputDialog("Inserte la velocdidad de frenado");
       primerCoche.frenar(Integer.parseInt(frenarrespuesta));
       JOptionPane.showMessageDialog(null,"La velocidad tras frenar es de :"+primerCoche.getVelocidade());
       
        
        //Corregido los shows
        
        
        
    }
   
}
