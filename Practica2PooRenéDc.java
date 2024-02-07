/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2poo.renédc;

/**
 *
 * @author invitado
 */
public class Practica2PooRenéDc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int Valor = 100;
//Instanciacion: Crear el objeto --> darle memoria
//Clase Identificador = new constrcutor();
//constructor --> Método con el mismo nombre de la clase 
Persona perso1 = new Persona ();//Instanciacion
System.out.println(perso1);
//perso1 --> referencia --> dirección en memoria
Vehiculo Placoson = new Vehiculo ();
System.out.println(Placoson);
    Placoson.Marca= "Ford";
    Placoson.Modelo = "Mustang";        
    Placoson.annio = 1965;
    System.out.println("Marca: " + Placoson.Marca);
    System.out.println("Modelo: " + Placoson.Modelo);
    System.out.println("Año: " + Placoson.annio);
    }
}
//Tipo de dato abstracto
class Persona {
    
}

class Vehiculo{
    //Atributos
    String Marca;
    int annio;
    String Modelo;
}