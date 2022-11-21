import java.util.ArrayList;

/**
 * Persona es una clase abstracta que tiene los atributos y metodos comunes a los catedraticos y estudiantes
 * @author Leonel Contreras 18797
 * @version 1.0
 */
public abstract class Persona {

    // atributos
    protected String nombre;
    protected String correo;
    protected String nocarnet;
    protected ArrayList<Intervalo> agenda;
    protected String contrasena;

    // metodos
    /** Persona es el constructor sin parametros de la clase
     */

     public  Persona() {
         
     }

    /** Persona es el constructor de la clase. Hace overloading al metodo anterior
     * @param nombre
     * @param correo
     * @param nocarnet
     * @param contrasena
     */
    public Persona(String nombre, String correo, String nocarnet, String contrasena){
        // asignamos valores a los atributos de la clase
        this.nombre = nombre;
        this.correo = correo;
        this.nocarnet = nocarnet;
        this.contrasena = contrasena;
        // inicializamos la agenda de la persona
        //this.agenda = new Horario();
    }

    //constructor (para la Persistencia)
    public Persona(String nombre, String correo, String nocarnet){
      this.nombre = nombre;
      this.correo = correo;
      this.nocarnet = nocarnet;
      this.agenda = new ArrayList<Intervalo>();
    }

    // set y get nombre
    public void Setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String Getnombre() {
        return this.nombre;
    }

    // set y get correo
    public void Setcorreo(String correo) {
        this.correo = correo;
    }

    public String Getcorreo() {
        return this.correo;
    }

    // set y get nocarnet
    public void Setnocarnet(String nocarnet) {
        this.nocarnet = nocarnet;
    }

    public String getnocarnet() {
        return this.nocarnet;
    }


    /** Agendarcita es un metodo abstracto que permite a la persona agendar una cita. Se delega a las clases hijas determinar
     * las instrucciones al metodo.
     * Se declara abstracto ya que, aunque por el momento los estudiantes y catedraticos agendan citas de la misma forma,
     * si en el futuro se desea cambiar esto, se debe modificar unicamente una clase.
     * @param intervalo es el intervalo que representa la cita
     * @return void 
     */

     public abstract void Agendarcita(Intervalo intervalo);
         

    /** Cancelarcita es un metodo que permite a la persona cancelar una cita. Se delega a cada subclase determinar el 
     * procedimiento para cancelar una cita. Se declara abstrato el metodo ya que, si se desea modificar como un estudiante o 
     * catedratico cancela una cita; se debe modificar tal clase y no dos.
     * @param intervalo
     * @return void
     */

     public abstract void Cancelarcita(Intervalo intervalo);

     /** Vercitasenfecha es un metodo que permite ver las citas que tiene la persona en una fecha indicada
      * @param fecha es un String que indica la fecha a consultar
      * @return un ArrayList de intervalos en una fecha particular
      */

      public ArrayList<Intervalo> Vercitasenfecha(String fecha) {

        // creamos un arraylist de intervalos
          ArrayList<Intervalo> citasenfecha = new ArrayList<Intervalo>();

          // recorremos la agenda de la persona
          for (Intervalo intervalo : this.agenda) {
              if (intervalo.Getfecha().equals(fecha)) {
                  citasenfecha.add(intervalo);
              }
          }

          return citasenfecha;
      }

    public String toString(){ // E; nombre; correo; Numero_Carné;
      return this.nombre + ";" + this.correo + ";" + this.nocarnet;
    }
}
