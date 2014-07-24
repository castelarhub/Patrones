package com.castelar.patterns.singleton;

/**
 *
 * @author operador
 */
public class SingleObject {
    
    private static final SingleObject instancia = new SingleObject();
    
    /**
     * Constructor privado.
     */
    private SingleObject(){
        System.out.println("Creando la instancia para el patron singleton");
    }
    
    /**
     * Recupera la unica instancia de la clase
     * @return SingleObject
     */
    public static SingleObject getInstancia(){
        System.out.println("Recuperando la instancia");
        return instancia;        
    }
    
    /**
     * 
     * @return 
     */
    public String getMessage(){
        return "La hora es:"+ new java.util.Date();
    }
    
}
