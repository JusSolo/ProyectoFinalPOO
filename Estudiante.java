public class Estudiante extends Persona{

  //constructor (para creo una nuevo estudiante)
  public Estudiante(String nombre, String correo, String nocarnet){
    super(nombre, correo, nocarnet);
  }
  //constructor (para la Persistencia)
  public Estudiante(String nombre, String correo, String nocarnet, Horario agenda){
    super(nombre, correo, nocarnet, agenda);
  }
 //toString
  public String toString(){ // E; nombre; correo; Numero_Carné;
    return "E" + ";" + this.nombre + ";" + this.correo + ";" + this.nocarnet;
  }


}
