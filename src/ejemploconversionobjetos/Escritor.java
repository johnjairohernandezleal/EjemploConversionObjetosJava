/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconversionobjetos;

/**
 *
 * @author john hernandez
 */
public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    public String obtenerDetalle(){
        return super.obtenerDetalles() + "TipoEscritura: " + tipoEscritura.getDescripcion();
    }
    public  TipoEscritura getTipoEscritura(){
        return tipoEscritura;
    }
    public String getTipoDeEscrituraEnTexto(){
        return  tipoEscritura.getDescripcion();
    }
    
}
