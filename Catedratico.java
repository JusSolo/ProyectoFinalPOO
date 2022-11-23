import java.util.ArrayList;
/**
  * @author Leonel Contreras 18797
  * @author Ian Castellanos 18797
  * @autor Juan Luis Solórzano 201598
  * @version 1.0
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

  //constructor (para la Persistencia)
  /** Catedratico es el constructor de la clase, usa la referencia super para llamar al constructor de la clase padre
   * @param nombre es un String que representa el nombre del estudiante
   * @param nocarnet es un Stirng que representa el numero de carnet del estudiante
   * @param contrasena es un String que representa la contrasena del estudiante
   * @param se ingresa la agenda, pues al cargase los datos es importante recordar la agenda
   * @return  al ser contructor no tiene retorno
   *
   */
  public Catedratico(String nombre, String nocarnet,String contrasena, ArrayList<Intervalo> agenda){
    super(nombre, nocarnet, contrasena, agenda);
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





   /** toString
    *
    * @return String, todos los atributos de la clase
    * @throws ContrasenaNoValidaException
    */
     public String toString(){ // E; nombre; correo; Numero_Carné;
       String h = ""; // h va a contener dota la informacion de todos los intervalos
       for (Intervalo i :agenda ){
         h = h +  i.toString() + ";" ;
       }
       h = h.substring(0, h.length() -2); // elimina el ultimo caracter de la cadena que es un ";"
       return "C" + this.nombre + ";" + ";" + this.nocarnet + ";" + this.contrasena + h;
     }

}
