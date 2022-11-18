/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_4_transportes;

/**
 *
 * @author Juan Carlos
 */
public class Practica_4_Transportes {

    
    public static void main(String[] args) {
        
        Automovil audi = new Automovil(15);
        Automovil tesla = new Automovil((double)20);
        
        Tren locomotora = new Tren(10);
        Tren metro = new Tren((double) 20);
        
        Avion carga = new Avion(24);
        Avion primer_clase = new Avion((double) 20);
    }
    
}
