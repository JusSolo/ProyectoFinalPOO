import java.util.*;
import java.io.*;
public class Persistencia {
 //Nota importante es Necesario ejecutar en el Principal Primero cargarHorarios y Luego CargarPersona

  List<Persona> personas = new ArrayList<Persona>();
  List<Horario> horarios = new ArrayList<Horario>();

  // ete metodo es para cargare en el progarama a las personas del arcgivo
  public void cargarPersonas(){
      String nombreFichero = "personas.txt";
      // Declarar una variable BufferedReader
      BufferedReader br = null;
      try {
          // Crear un objeto BufferedReader al que se le pasa
          //   un objeto FileReader con el nombre del fichero
          br = new BufferedReader(new FileReader(nombreFichero));
          // Leer la primera línea, guardando en un String
          String texto = br.readLine();
          // Repetir mientras no se llegue al final del fichero
          while(texto != null) {
              // Hacer lo que sea con la línea leída
              //Formato de los datos en el archivo
              // E; nombre; correo; Numero_Carné; \n la E es de estudiante y la C de catedrático
              String[] datos = texto.split(";");
              String nombre = datos[1];
              String correo = datos[2];
              String Numero_Carne = datos[3];
              Horario h = horarios.get(0);// Solo es para instancear h con algo
              for (Horario H : horarios){
                if (Numero_Carne  == H.getnocarnet()){
                  h = H;
                  break;
                }
              }

              switch(datos[0]){

                case "E": //Estudiante
                  Estudiante e = new Estudiante(nombre, correo, Numero_Carne, h);
                  personas.add(e);
                break;

                case "C": //catedrático
                Catedratico c = new Catedratico(nombre, correo, Numero_Carne, h);
                personas.add(c);
                break;
              }


              // Leer la siguiente línea
              texto = br.readLine();
          }
      }
      // Captura de excepción por fichero no encontrado
      catch (FileNotFoundException ex) {
          System.out.println("Error: Fichero no encontrado");
          ex.printStackTrace();
      }
      // Captura de cualquier otra excepción
      catch(Exception ex) {
          System.out.println("Error de lectura del fichero");
          ex.printStackTrace();
      }
      // Asegurar el cierre del fichero en cualquier caso
      finally {
          try {
              // Cerrar el fichero si se ha podido abrir
              if(br != null) {
                  br.close();
              }
          }
          catch (Exception ex) {
              System.out.println("Error al cerrar el fichero");
              ex.printStackTrace();
          }
      }
  }

  // Este es el metodo para guardar en archivo todo lo modificado
  public void guardarPersona(){
    //Un texto cualquiera guardado en una variable

    try {
        //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
        File archivo = new File("personas.txt");
        archivo.delete();

        //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
        FileWriter escribir = new FileWriter(archivo, true);


        //Escribimos en el archivo con el metodo write
        for(Persona p : personas){
          escribir.write(p.toString());
          escribir.write("\r\n");
        }


        //Cerramos la conexion
        escribir.close();
    } //Si existe un problema al escribir cae aqui
    catch (Exception e) {
        System.out.println("Error al escribir");
    }

  }

}
