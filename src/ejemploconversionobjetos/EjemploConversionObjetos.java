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
public class EjemploConversionObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * 1:Creamos un tipo de mas alta jerarquia
         */
        Empleado empleado;
        /**
         * asignamos una referencia de un objeto de menor jerarquia
         * esto es upcasting, no hay necesidad de una notacion especial
         */
        empleado = new Escritor("roy", 15000, TipoEscritura.CLASICO);
        
        /**
         * sin embargo si quisieramos acceder al detalle de la clase escritor
         * no es posible, ya que esas caracterisiticas no esta en comun
         * entre todas las clases de jerarquia de clases
         * emp.getTipoDeEscrituraEnTexto();
         */
        
        /**
         * Imprimimos los detalles en un metodo generico
         */
        imprimirDetalles(empleado);
        /**
         * 2. podemos hacer lo mismo con la clase gerente
         * esto es un upcasting, por lo que no requiere una sintaxis especial
         */
        empleado = new Gerente("Laura", 18000, "Sistemas");
        /**
         * pero si queremos acceder directo a la variable empleado
         * al detalle de l objeto gerente no es posible, se pierde el acceso
         * empleado.getDepartamento();
         * Utilizamos el mismo metodo para imprimir los detalles
         */
        imprimirDetalles(empleado);
        
    }
    public static void imprimirDetalles(Empleado empleado){
        String resultado = null;
        /**
         * Imprimir detalles en general para todos ya que es por polimorfismo
         * no se necesita ninguna converison
         */
        System.out.println("\nDetalle:" + empleado.obtenerDetalles());
        /**
         * pero los detalles de cada clase debemos hacer un downcasting
         */
        if (empleado instanceof Escritor) {
            /**
             * convertimos el objeto al tipo inferior deseado
             * conviete objeto- Downcasting
             */
            Escritor escritor = (Escritor) empleado;
            /**
             * finalmente podemos acceder a los metodos de la clase escritor
             */
            
            resultado = escritor.getTipoDeEscrituraEnTexto();
            /**
             * hay otra forma de hacer esa conversion en la misma linea de codigo
             * esta es muy comun encontrarla en java
             * para evitar crear variables innecesarias
             */
            resultado =((Escritor)empleado).tipoEscritura.getDescripcion();
            System.out.println("Resultado tipo Escritura: " + resultado);
            
        }else if (empleado instanceof Gerente) {
            /**
             * Hacemos el downcasting en la misma linea de codigo
             * nos ahorramos una variable
             */
            resultado = ((Gerente)empleado).getDepartamento();
            System.out.println("Resultado departamento:"+ resultado);
            
        }
        
    }
    
    
}
