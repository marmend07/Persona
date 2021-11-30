/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author marme
 */
public class TestHerencia1 {
    public static void main (String [ ] Args) {

        Profesor profesor1 = new Profesor ("Gerardo", "Rivas Gonzalez", 40);

        profesor1.setIdProfesor("33-457-34");

        profesor1.mostrarNombreApellidosYCarnet();}
}
