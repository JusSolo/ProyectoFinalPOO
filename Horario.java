import java.util.ArrayList;

 /**
  * Horario es una clase que simula la agenda de una persona.
  * @author Leonel (18797)
  * @author Ian (22128)
  * @version 1.0
  */


public class Horario {

    // atributos
    private ArrayList<Intervalo> listaintervalos;
    //String numero_Carne;
    // meteodos

    /** Horario es el contrustor de la clase; no tiene parametros
     * @return al ser constructor, no tiene retorno
     */

    public Horario() {
      // inicializamos el array de intervalos
      listaintervalos = new ArrayList<Intervalo>();
    }

    /** Agregarintervalo es un metodo que agrega un intervalo al array de intervalos
     * @param intervalo es el intervalo a agregar
     * @return void
     */

     public void Agregarintervalo(Intervalo intervalo) {
      this.listaintervalos.add(intervalo);
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
