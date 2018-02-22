package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Palabras {

    File fich;
    FileWriter f1;
    PrintWriter escribir;
    ArrayList <String> lista=new ArrayList();
    /**
     * El metodo añadir palabras se encarga de añadir palabras al Array.
     */
    public void añadirPalabras(){
        
        int palabras=Integer.parseInt(JOptionPane.showInputDialog("Cuantas palabras vas ha añadir?"));
        int m=0;
        do{
            lista.add(JOptionPane.showInputDialog("palabra"));
            m++;
            
        }while(m<palabras);
        
        
    }
    /**
     * Metodo que ordena la lista alfabeticamente.
     */
    public void ordenarLista(){
        Collections.sort(lista);
//       for(int i=0;i<lista.size();i++){System.out.println(lista.get(i));}
           
    }
    /**
     * Metodo escribir frase que recorre el array y escribe en un fichero las palabras.
     */
    public void escribirFrase() {
        fich=new File("palabras.txt");
        try {
            escribir=new PrintWriter(fich);
            for (int i=0; i<lista.size(); i++) {
                escribir.println((i+1)+" "+lista.get(i));
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Palabras.class.getName()).log(Level.SEVERE,null,ex);
        }
        
         
        escribir.close();
        
    }
}
