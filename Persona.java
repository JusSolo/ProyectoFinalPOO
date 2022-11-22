import java.util.ArrayList;

/**
 * Persona es una clase abstracta que tiene los atributos y metodos comunes a los catedraticos y estudiantes
 * @author Leonel Contreras 18797
 * @author Ian Castellanos 22128
 * @version 1.0
 */
public abstract class Persona {

    // atributos
    protected String nombre;
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
     * @param nocarnet
     * @param contrasena
     */
    public Persona(String nombre, String nocarnet, String contrasena){
        // asignamos valores a los atributos de la clase
        this.nombre = nombre;
        this.nocarnet = nocarnet;
        this.contrasena = contrasena;
        this.agenda = new ArrayList<Intervalo>();
    }

    /*//constructor (para la Persistencia)
    public Persona(String nombre, String correo, String nocarnet){
      this.nombre = nombre;
      this.nocarnet = nocarnet;
      this.agenda = new ArrayList<Intervalo>();
    }*/

    // set y get nombre
    public void Setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String Getnombre() {
        return this.nombre;
    }

    // set y get nocarnet
    public void Setnocarnet(String nocarnet) {
        this.nocarnet = nocarnet;
    }

    public String getnocarnet() {
        return this.nocarnet;
    }

    // set y get contrasena
   public void Setcontrasena(String contrasena) {
       this.contrasena = contrasena;
   }

   public String Getcontrasena() {
       return this.contrasena;
   }


    /** Agendarcita es un metodo abstracto que permite a la persona agendar una cita. Se delega a las clases hijas determinar
     * las instrucciones del metodo.
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
              // validamos si coinciden las fechas
              if (intervalo.Getfecha().equals(fecha)) {
                  // si las fechas coinciden, se agrega el intervalo al arraylist
                  citasenfecha.add(intervalo);
              }
          }

          return citasenfecha;
      }

      /** Getcita es un metodo que dado un arraylist de citas y la posicion que ocupa en esa lista la cita, retorna un objeto 
       * de tipo intervalo que representa la cita
       * @param listacitasfecha
       * @param posicion 
       * @return un objeto de tipo intervalo que representa la cita
        */

        public Intervalo Getcita(ArrayList<Intervalo> listacitasfecha, int posicion) {
           return listacitasfecha.get(posicion); 
        }

      /** Validarcita es un metodo que determina que si la cita interfiere con otras citas agendadas en una fecha particular
       * @param horainicio es un int que indica la hora de inicio de la cita a crear
       * @param horafinal es un int que indica la hora de finalizacion de la cita a crea
       * @param listacitasfecha es un ArrayList con todas las citas en una fecha particular
       * @return void
       * @throws IterferenciaDeCitaException
       */

       public void Validarcita(int horainicio, int horafinal, ArrayList<Intervalo> listacitasfecha) throws InterferenciaDeCitaException{
           for (Intervalo intervalo : listacitasfecha) {
               if (horainicio<intervalo.Gethorafinal() && intervalo.Gethorafinal()<horafinal) {
                   throw new InterferenciaDeCitaException("No es posible realizar la cita con el horario ingresado");
               }

               if (horainicio<intervalo.Gethorainicio() && intervalo.Gethorainicio()<horafinal) {
                   throw new InterferenciaDeCitaException("No es posible realizar la cita con el horario ingresado");
               }

               if (intervalo.Gethorainicio()<horainicio && horafinal<intervalo.Gethorafinal()) {
                   throw new InterferenciaDeCitaException("No es posible realizar la cita con el horario ingresado");
               }

               if (intervalo.Gethorainicio()==horainicio && intervalo.Gethorafinal()==horafinal) {
                   throw new InterferenciaDeCitaException("No es posible realizar la cita con el horario ingresado");
               }
           }
       }

       /** Validarcontrasena es un metodo que valida la contrasena del usuario
        * @param contrasena es un String que representa el input del usuario
        * @return void
        * @throws ContrasenaNoValidaException
        */

        public void Validarcontrasena(String contrasena) throws ContrasenaNoValidaException{
            boolean valida = false;

            if (contrasena.equals(this.Getcontrasena())) {
                valida = true;
            }

            if (valida== false) {
                throw new ContrasenaNoValidaException("La contrasena ingresada no es valida");
            }
        }

      // eliminamos el correo!!!!
    /*public String toString(){ // E; nombre; correo; Numero_Carné;
      return this.nombre + ";" + this.correo + ";" + this.nocarnet;
    }*/
}
