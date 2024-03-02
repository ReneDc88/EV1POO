/*

 */
package clases_examen;


public class TestCovid {

//Atributos
    private int edad;
    private boolean enfermedad;
    private double peso;
    private double estatura;

//Getter
    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public String isEnfermedad() {
        if (enfermedad) {
            return "Si";
        } else {
            return "No";
        }
    }

    //Setter
    public void setEdad(int n) {
        edad = n;
    }

    public void setEnfermedad(boolean n) {
        enfermedad = n;
    }

    public void setPeso(double n) {
        peso = n;
    }

    public void setEstatura(double n) {
        estatura = n;
    }

    public String calcularPersonaRiesgo() {
        double imc = peso / (estatura * estatura); // <--- imc

        if (imc >= 30 || (enfermedad) || edad>=65) {
            return "Persona en riesgo de contraer covid.";
        } else {
            return "Persona no esta en riesgo de contraer covid.";
        }

    }

    public TestCovid() { //Parámetros
        edad = 42;
        enfermedad = true;
        peso = 94;
        estatura = 1.77;
    }

    
    
    
    
    
    
    
    
    
    



    
}
