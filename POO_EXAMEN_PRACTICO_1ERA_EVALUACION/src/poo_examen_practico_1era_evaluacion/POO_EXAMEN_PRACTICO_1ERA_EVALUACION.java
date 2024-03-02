/*

 */
package poo_examen_practico_1era_evaluacion;


import clases_examen.TestCovid;
import clases_examen.DatosIntegrantes;

public class POO_EXAMEN_PRACTICO_1ERA_EVALUACION {

 
    public static void main(String[] args) {
       //Test COVID
    
        System.out.println("\n\t---TEST COVID---");
        TestCovid test = new TestCovid();

        test.setEdad(25);
        test.setEnfermedad(false);
        test.setEstatura(1.64);
        test.setPeso(80);

        System.out.println("\nDatos de"
                + "\nPersona 1: " + test.calcularPersonaRiesgo());
     
        TestCovid test2 = new TestCovid();
        
        System.out.println("\nDatos de"
                + "\nPersona 2: " + test2.calcularPersonaRiesgo()); 
        
 //-----------------------------------------------------------------------------      
   
  System.out.println("\n----------------------------------------------------------------------------- ");
  
    //Datos Integrantes    
        
     DatosIntegrantes.imprimirDatosEquipo();
     DatosIntegrantes.imprimirProblemasResueltos();
        
        
        
     
     
       
    }
    
}
