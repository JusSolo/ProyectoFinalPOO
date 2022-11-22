/**
 * Estudiante es la clase que modela a los estudiantes. Extiende a la clase persona
 * @author Leonel Contreras 18797
 * @author Ian Castellanos 18797
 * @version 1.0
 */


public class Estudiante extends Persona{

  /** Estudiante es el constructor de la clase, usa la referencia super para llamar al constructor de la clase padre
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






  /*//constructor (para la Persistencia)
  public Estudiante(String nombre, String correo, String nocarnet, Horario agenda){
    super(nombre, correo, nocarnet, agenda);
  }
 //toString
  public String toString(){ // E; nombre; correo; Numero_Carné;
    return "E" + ";" + this.nombre + ";" + this.correo + ";" + this.nocarnet;
  }*/


}
