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
public class Avion extends Vehiculo{
    public Avion(){
        
    }
    
    public Avion(int diesel){
        this.encenderAutomovil(diesel);
        this.avanzaAutomovil(diesel);
    }
    
    public Avion(double carga){
        this.encenderAutomovile(carga);
        this.avanzaAutomovil(carga);
    }
    
    private void encenderAutomovil(int diesel){
        if(diesel > 1){
            System.out.println("Avion encendido. Despegando.");
        }else{
            System.out.println("Se requiere mas diesel.");
        }
    }
    
    private void avanzaAutomovil(int diesel){
        if(diesel > 1 && diesel < 25){
            System.out.println("Queda poco gas.");
        }else{
            System.out.println("Puede avanzar.");
        }
    }
    
    private void encenderAutomovile(double carga){
        if(carga > 1){
            System.out.println("Avion encendido. Bateria Suficiente.");
        }else{
            System.out.println("No tiene suficiente carga.");
        }
    }
    
    private void avanzaAutomovil(double carga){
        if(carga > 1 && carga < 25){
            System.out.println("Queda poca carga");
        }else{
            System.out.println("Puede avanzar.");
        }
    }
}
