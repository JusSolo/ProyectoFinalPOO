/**
 * Departamento es el controlador
 * @author Leonel Contreras 
 * @author Ian Castellanos
 * @version 1.0
 */

import java.util.ArrayList;

public class Departamento {

    // atributos
    ArrayList<Persona> listapersonas;
    

    // metodos
    /** Departamento es el constructor de la clase */
    public  Departamento() {
        this.listapersonas = new ArrayList<Persona>();
    }

    /** Agregarestudiante es un metodo que crea un estudiante y lo agrega a la lista de personas
     * @param nombre es un String que representa el nombre del estudiante
     * @param nocarnet es un Stirng que representa el numero de carnet del estudiante
     * @param contrasena es un String que representa la contrasena del estudiante
     * @return un String que indica que se ha agregado al estudiante
     */

     public String Agregarestudiante(String nombre, String nocarnet, String contrasena) {
         // creamos una instancia de estudiante
         Estudiante estudiante = new Estudiante(nombre,nocarnet,contrasena);

         // agregamos la instancia de estudiante a la lista de estudiantes
         this.listapersonas.add(estudiante);

         return "Se ha agregado al estudiante " + nombre + " con carnet " + nocarnet;
     }

     /** Agregarcatedratico es un metodo que crea un catedratico y lo agrega a la lista de personas
      * @param nombre es un String que representa el nombre del catedratico
      * @param nocarnet es un String que representa el numero de carnet del estudiante
      * @param contrasena es un String que representa la contrasena del catedratico
      * @return un String que indica que se ha agregado al catedratico
      */

      public String Agregarcatedratico(String nombre, String nocarnet, String contrasena) {
          // creamos una instancia de catedratico
          Catedratico catedratico = new Catedratico(nombre,nocarnet,contrasena);

          // agregamos la instancia de catedratico a la lista de personas
          listapersonas.add(catedratico);

          // retornamos un String
          return "Se ha agregado exitosamente al catedratico " + nombre + " con carnet " + nocarnet; 
      }
 
      /** Getposicionpersona es un metodo que retorna la posicion de un usuario en la lista de personas dado su numero de carnet
       * @param nocarnet es un String que representa el numero de carnet del usuario
       * @return un int que indica la posicion de la persona en la lista de personas
       */

       public int Getposicionpersona(String nocarnet) {

           int posicion = 0;
           for (Persona persona : listapersonas) {
               if (persona.getnocarnet().equals(nocarnet)) {
                   posicion = listapersonas.indexOf(persona);
                   break;
               }
           }
           return posicion;
       }

       /** Getpersona es un metodo que dada la posicion de la persona en la lista de personas; retorna a tal person
        * @param posicion es un int que indica la posicion de la persona
        * @return un objeto de tipo Persona
        */

        public Persona Getpersona(int posicion) {
            return this.listapersonas.get(posicion);
        }

        /** Getultimo es un metodo que retorna la persona en la ultima posicion de la lista de personas
         * @return un objeto de tipo persona 
         */
        public Persona Getultimo() {
            return this.listapersonas.get(listapersonas.size()-1);
        }

       /** Carnetduplicado es un metodo que indica si ya existe alguna persona con el carnet ingresado
        * @param nocarnet es un String que representa el numero de carnet a ingresar
        * @return void
        * @throws CarnetDuplicadoException
        */
    
        public void Carnetduplicado(String nocarnet) throws CarnetDuplicadoException{
            boolean duplicado = false;
            for (Persona persona : listapersonas) {
                if (persona.getnocarnet().equals(nocarnet)) {
                    duplicado = true;
                    break;
                }
            }

            if (duplicado==true) {
                throw new CarnetDuplicadoException("Ya existe un usuario con este numero de carnet");
            }
        }

        /** Validarnocarnet es un metodo que indica si existe un usuario con el id ingresado
         * @param nocarnet es un String que representa el id
         * @return void
         * @throws UsuarioNoExisteException
         */
        public void Validarnocarnet(String nocarnet) throws UsuarioNoExisteException{
            boolean existe = false;
            for (Persona persona : listapersonas) {
                if (persona.getnocarnet().equals(nocarnet)) {
                    existe = true;
                    break;
                }
            }

            if (existe==false) {
                throw new UsuarioNoExisteException("No existe un usuario con el numero de carnet ingresado");
            }
        }









}