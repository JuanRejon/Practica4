/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_4_transportes;
import vehiculos.Vehiculo;
/**
 *
 * @author Juan Carlos
 */
public class Tren extends Vehiculo{
    public Tren(){
        
    }
    
    public Tren(int carbon){
        this.encenderTren(carbon);
        this.avanzarTren(carbon);
    }
    
    public Tren(double carga){
        this.encenderTren(carga);
        this.avanzarTren(carga);
    }
    
    private void encenderTren(int carbon){
        if(carbon > 5){
            System.out.println("La locomotora puede arrancar.");
        }else{
            System.out.println("Se requiere mas carbon.");
        }
    }
    
    private void avanzarTren(int carbon){
        if(carbon > 5 && carbon < 30){
            System.out.println("El carbon se esta terminando. Echar mas carbon.");
        }else{
            System.out.println("El tren puede avanzar.");
        }
    }
    
    private void encenderTren(double carga){
        if(carga > 5){
            System.out.println("El metro puede arrancar.");
        }else{
            System.out.println("Se requiere mas electricidad.");
        }
    }
    
    private void avanzarTren(double carga){
        if(carga > 5 && carga < 30){
            System.out.println("La carga se esta terminando. Recagrar inmediatamente.");
        }else{
            System.out.println("El metro puede avanzar.");
        }
    }
}
