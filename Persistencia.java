import java.util.*;
import java.io.*;
/**
 * Persistencis es una clase s¿que se encarga exclusivamente de la persistencia
 * @autor Juan Luis Solórzano 201598
 * @version 1.0
 */
public class Persistencia {
 //Nota importante es Necesario ejecutar en el Principal Primero cargarHorarios y Luego CargarPersona

  ArrayList<Persona> personas = new ArrayList<Persona>();


  // ete metodo es para cargare en el progarama a las personas del archivo
  public ArrayList<Persona> cargarPersonas(){
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
              // E; nombre; Numero_Carné; contraseña ; intervalo1String ; intervalo2;string ..... i \n la E es de estudiante y la C de catedrático
              String[] datos = texto.split(";");
              String nombre = datos[1];
              String Numero_Carne = datos[2];
              String contrasena = datos[3];
              // crear todos los intervalos de las personas
              ArrayList<Intervalo> agenda = new ArrayList<Intervalo>();
              Intervalo intervalo;
              for (int i = 4; i < datos.length; i += 7){
                int horainicio = Integer.parseInt(datos[i]);
              	int horafinal  = Integer.parseInt(datos[i+1]);
              	String fecha = datos[i+2];
              	boolean estado = (datos[i+3] == "true");
              	String idcatedratico =  datos[i+4];
              	String idestudiante = datos[i+5];;
              	String curso = datos[i+6];
                intervalo = new Intervalo( horainicio, horafinal, fecha, idcatedratico, idestudiante, curso, estado);
                agenda.add(intervalo);
              }


              switch(datos[0]){

                case "E": //Estudiante
                  Estudiante e = new Estudiante(nombre, Numero_Carne, contrasena, agenda);
                  personas.add(e);
                break;

                case "C": //catedrático
                Catedratico c = new Catedratico(nombre, Numero_Carne, contrasena, agenda);
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
   return personas;
  }

  // Este es el metodo para guardar en archivo todo lo modificado
  public void guardarPersona(ArrayList<Persona> p){
    //Un texto cualquiera guardado en una variable
    this.personas = p;
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
