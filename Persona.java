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
    protected Horario agenda;

    //constructor (para creo una nueva persona)
    public Persona(String nombre, String correo, String nocarnet){
      this.nombre = nombre;
      this.correo = correo;
      this.nocarnet = nocarnet;
    }

    //constructor (para la Persistencia)
    public Persona(String nombre, String correo, String nocarnet, Horario agenda){
      this.nombre = nombre;
      this.correo = correo;
      this.nocarnet = nocarnet;
      this.agenda = agenda;
    }

    // metodos

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

    // set  y get agenda
    public void Setagenda(Horario agenda) {
        this.agenda = agenda;
    }

    public Horario Getagenda() {
        return this.agenda;
    }

    /**Agendarcita es un metodo que permite a una persona agendar una cita con otra persona
     * @param pesona es de tipo persona e indica con quien se desea agendar la cita
     * @param horainicio es un enterio que indica la hora de inicio de la cita
     * @param horafinal es un entero que indica la hora en que finaliza la cita
     * @return void.
     */

     public void Agendarcita(Persona persona, int horainicio, int horafinal) {

     }
    public String toString(){ // E; nombre; correo; Numero_Carné;
      return this.nombre + ";" + this.correo + ";" + this.nocarnet;
    }
}
