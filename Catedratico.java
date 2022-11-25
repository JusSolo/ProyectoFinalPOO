/**
 * Catedratico
 */

import java.util.ArrayList;

public class Catedratico extends Persona{

  // atributos
  private ArrayList<String> listacursos;

  // metodos 

    /** Catedratico es el constructor sin parametros de la clase */
    public  Catedratico() {
      super();
    }
  
    /** Catedratico es el constructor de la clase, usa la referencia super para llamar al constructor de la clase padre
     * @param nombre es un String que representa el nombre del catedratico
     * @param nocarnet es un String que representa el numero de carnet del estudiante
     * @param contrasena es un String que representa la contrasena del catedratico
     * @return al ser constructor, no tiene retorno
     */
      public Catedratico(String nombre, String nocarnet, String contrasena){
        super(nombre, nocarnet, contrasena);
        this.listacursos = new ArrayList<String>();
      }

      /** Agregarcurso es un metodo que agrega, un curso a la vez, a la lista de cursos del catedratico
       * @param curso es un String que indica el curso que se va a agregar al catedratico
       * @return void
       */

       public void Agregarcurso(String curso) {
         this.listacursos.add(curso);
       }

       /** Validarcurso es un metodo que valida que el catedratico si imparta cierto curso
        * @param cursoavalidar es un String que indica el curso que se desea validad
        * @return void
        * @throws CursoNoValidoException
        */
        public void Validarcurso(String cursoavalidar) throws CursoNoValidoException{
          boolean valido = false;
          
          // recorremos la lista de cursos del catedratico
          for (String string : listacursos) {
            if (string.equals(cursoavalidar)) {
              valido=true;
              break;
            }
          }

          if (valido== false) {
            throw new CursoNoValidoException("El catedratico no imparte este curso");
          }
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
    }

