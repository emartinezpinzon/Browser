package controlador;

import java.util.Stack;

/**
 * Controlador del proyecto
 * @author Emanuel Martínez
 * @version 1.0
 */
public class Navegador {
    private Stack<String> historial;
    private Stack<String> historialAux;
    
    public Navegador(){
        historial = new Stack<>();
        historialAux = new Stack<>();
    }
    
    public void agregarVisita(String pagina){
        historial.push(pagina);
    }
    
    public void verActual(){
        System.out.println("Usted está visitando: "+historial.peek());
    }
    
    public void verAnterior(){
        String actual = historial.pop();
        historialAux.push(actual);
        System.out.println("Usted se ha ido a la página anterior: "+historial.peek());
    }
    
    public void verSiguiente(){
        String anterior = historialAux.pop();
        historial.push(anterior);
        System.out.println("Usted está en la página siguiente: "+historial.peek());
    }
    
    public void verHistorial(){
        for(String x : historial)
            System.out.println("Página "+x);
    }
}
