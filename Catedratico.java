/**
 * InnerCatedratico
 */


public class Catedratico extends Persona{
  
/** Catedratico es el constructor de la clase, usa la referencia super para llamar al constructor de la clase padre
 * @param nombre es un String que representa el nombre del catedratico
 * @param nocarnet es un String que representa el numero de carnet del estudiante
 * @param contrasena es un String que representa la contrasena del catedratico
 * @return al ser constructor, no tiene retorno
 */
  public Catedratico(String nombre, String nocarnet, String contrasena){
    super(nombre, nocarnet, contrasena);
  }

  @Override
  public void Agendarcita(Intervalo intervalo) {
    // agregamos el intervalo a la agenda del catedratico
    this.agenda.add(intervalo);
  }

  @Override
  public void Cancelarcita(Intervalo intervalo) {
    this.agenda.remove(intervalo);
  }





  /*//constructor (para la Persistencia)
  public Catedratico(String nombre, String correo, String nocarnet, Horario agenda){
    super(nombre, correo, nocarnet, agenda);
  }

  //toString
   public String toString(){ // E; nombre; correo; Numero_Carné;
     return "C" + ";" + this.nombre + ";" + this.correo + ";" + this.nocarnet;
   }*/

}
