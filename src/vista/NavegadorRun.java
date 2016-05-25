package vista;

import modelo.NavegadorController;

/**
 * Clase principal del proyecto
 * @author Emanuel Martínez
 * @version 1.0
 */
public class NavegadorRun {
    public static void main(String [] args){
        NavegadorController navegador = new NavegadorController();
        
        navegador.agregarVisita("google");
        navegador.agregarVisita("facebook");
        navegador.agregarVisita("youtube");
        navegador.agregarVisita("drive");
        navegador.agregarVisita("whatsapp");
        navegador.agregarVisita("github");
        System.out.println("Ready!\n");
        
        navegador.verHistorial();
        System.out.println("------------------------");
        navegador.verActual();
        System.out.println("------------------------");
        navegador.verHistorial();
        System.out.println("------------------------");
        navegador.verAnterior();
        System.out.println("------------------------");
        navegador.verHistorial();
        System.out.println("------------------------");
        navegador.verSiguiente();
        System.out.println("------------------------");
        navegador.verHistorial();
    }
}
