import java.util.ArrayList;

 /**
  * Horario es una clase que simula la agenda de una persona.
  * @author Leonel (18797)
  * @author Ian (22128)
  * @version 1.0
  */


public class Horario {

    // atributos
    private ArrayList<Intervalo> intervalos;
    String numero_Carne;
    // meteodos

    /** Horario es el contrustor de la clase; no tiene parametros
     * @return al ser constructor, no tiene retorno
     */

    public Horario() {

        intervalos = new ArrayList<Intervalo>();
    }

    /** Agregarintervalo es un metodo que agrega un intervalo al array de intervalos
     * @param fecha es la fecha en que se va a realizar la cita
     * @param horainicio es la hora de inicio de la cita
     * @param horafinal es la hora en que termina la reunion
     * @param Persona es la persona con quien se va a tener la cita
     * @return void
     */

     public void Agregarintervalo() {

     }
     //get de numero_Carne
     public String getnocarnet(){
       return this.numero_Carne;
     }

     //set de numero_Carne

     public void Setnocarnet(String car){
       this.numero_Carne = car;
     }

}
