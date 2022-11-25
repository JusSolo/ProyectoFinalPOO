/**
 * Estudiante es la clase que modela a los estudiantes. Extiende a la clase persona
 * @author Leonel Contreras 18797
 * @author Ian Castellanos 18797
 * @version 1.0
 */

import java.util.ArrayList;

public class Estudiante extends Persona{

  /** Estudiante es el constructoe sin parametros de la clase */
  public  Estudiante() {
    super();
  }

    /** Estudiante es el constructor de la clase, hace overloading al metodo anterior. Usa la referencia super para llamar al constructor de la clase padre
     * @param nombre es un String que representa el nombre del estudiante
     * @param nocarnet es un Stirng que representa el numero de carnet del estudiante
     * @param contrasena es un String que representa la contrasena del estudiante
     * @return  al ser contructor no tiene retorno
     */
    public Estudiante(String nombre, String nocarnet, String contrasena){
      super(nombre, nocarnet, contrasena);
    }
  
    @Override
    public void Agendarcita(Intervalo intervalo) {
      this.agenda.add(intervalo);
    }
  
    @Override 
    public void Cancelarcita(Intervalo intervalo) {
      this.agenda.remove(intervalo);
    }  
  }