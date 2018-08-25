/*
Caracteristicas Frame:
Nacen invisibles, se necesita el metodo setVisible para hacerlos visibles.
nacen con un tam inutil, Se necesita setSize para darles tamaño
Conviene decir que debe hacer el programa si se cierra un frame.
 */
package aplicaciones_graficas;

/**
 *
 * @author aldemaro
 */
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        miMarco marco1 = new miMarco();
        
    }
    
}

class miMarco extends JFrame{
    
    public miMarco(){
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}