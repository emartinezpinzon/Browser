package modelo;

import controlador.Navegador;

/**
 * Modelo del proyecto
 * @author Emanuel Martínez
 * @version 1.0
 */
public class NavegadorController {
    Navegador navegador = new Navegador();
    
    public void agregarVisita(String pagina){
        navegador.agregarVisita(pagina);
    }
    
    public void verActual(){
        navegador.verActual();
    }
    
    public void verAnterior(){
        navegador.verAnterior();
    }
    
    public void verSiguiente(){
        navegador.verSiguiente();
    }
    
    public void verHistorial(){
        navegador.verHistorial();
    }
}
