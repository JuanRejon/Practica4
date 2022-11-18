
package practica_4_transportes;

import vehiculos.Vehiculo;

/**
 *
 * @author Juan Carlos
 */
public class Automovil extends Vehiculo{
    
    public Automovil(){
        
    }
    
    public Automovil(int gas){
        this.encenderAutomovil(gas);
        this.avanzaAutomovil(gas);
    }
    
    public Automovil(double carga){
        this.encenderAutomovile(carga);
        this.avanzaAutomovil(carga);
    }
    
    private void encenderAutomovil(int gas){
        if(gas > 1){
            System.out.println("Automovil encendido. Gasolina suficiente.");
        }else{
            System.out.println("No hay suficiente gasolina.");
        }
    }
    
    private void avanzaAutomovil(int gas){
        if(gas > 1 && gas < 10){
            System.out.println("Queda poco gas");
        }else{
            System.out.println("Puede avanzar.");
        }
    }
    
    private void encenderAutomovile(double carga){
        if(carga > 1){
            System.out.println("Automovil encendido. Bateria Suficiente.");
        }else{
            System.out.println("No tiene suficiente carga.");
        }
    }
    
    private void avanzaAutomovil(double carga){
        if(carga > 1 && carga < 20){
            System.out.println("Queda poca carga");
        }else{
            System.out.println("Puede avanzar.");
        }
    }
}
