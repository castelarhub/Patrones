package com.castelar.patterns.singleton;

/**
 *
 * @author operador
 */
public final class SingleObject {
    
    private static SingleObject instancia = null;
    private static int contador=0;
    
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
        
        if(instancia==null){
            instancia = new SingleObject();
        }
        System.out.println("Recuperando la instancia");
        return instancia;
    }
    
    /**
     * 
     * @return 
     */
    public String getMessage(){
        contador++;
        return "La hora es:"+ new java.util.Date() + ", el contador va en:"+contador;
    }
    
}
