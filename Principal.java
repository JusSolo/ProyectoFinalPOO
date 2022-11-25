/**
 * Principal es la clase que interactua con el usuario
 * @author Leonel Contreras 18797
 * @author Ian Castellanos 22128
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        // creamos una instancia de departamento
        Departamento deptomate = new Departamento();

        // creamos una referencia de catedratico
        Catedratico referenciacatedratico = new Catedratico();

        Estudiante referenciaestudiante = new Estudiante();

        // creamos una instancia de intervalo
        Intervalo referenciaintervalo = new Intervalo();

        // creamos una array de intervalos
        ArrayList<Intervalo> primerarraydeintervalos = new ArrayList<Intervalo>();

        ArrayList<Intervalo> segundoarrayintervalos = new ArrayList<Intervalo>();
       
        // declaramos dos variables Scanner
        Scanner texto = new Scanner(System.in);

        Scanner numero = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 6) {
            System.out.println(" ");
            System.out.println("Bienvenido al departamento de matematicas de la UVG");
            System.out.println("Ingrese una opcion");
            System.out.println("1. Agregar catedratico");
            System.out.println("2. Agregar estudiante");
            System.out.println("3. Agendar una cita");
            System.out.println("4. Cancelar una cita");
            System.out.println("5. Visualizar citas en una fecha");
            System.out.println("6. Salir del programa");
            System.out.println(" ");
            
            //boolean swtich = true;

            /*while (swtich) {
                try {
                    opcion = numero.nextInt();
                    swtich = false;
                } catch (Exception e) {
                    System.out.println("Ingreso un valor incorrecto");
                }
            }*/

            opcion = numero.nextInt();
            /*boolean valString = true;
            String nombre;
            String nocarnet;
            String contrasena;*/
            if (opcion == 1) {
                // pedimos al usuario que ingrese los datos del catedratico
                System.out.println("Ingrese el nombre del catedratico");
                String nombre = texto.nextLine();
                System.out.println("Ingrese el numero de carnet del catedratico");
                String nocarnet = texto.nextLine();
                System.out.println("Ingrese la constrasena del catedratico");
                 String contrasena = texto.nextLine();

                try {
                    // validamos que no exista un usuario con el carnet que se desea ingresar
                    deptomate.Carnetduplicado(nocarnet);
                    System.out.println(deptomate.Agregarcatedratico(nombre, nocarnet, contrasena));
                    System.out.println("Ingrese la cantidad de cursos que imparte el catedratico");
                    int cantidadcursos = numero.nextInt();
                    int contador = 1;
                    // agregamos los cursos que imparte el catedratico a la lista de cursos del catedratico
                    while (contador<=cantidadcursos) {
                        System.out.println("Ingrese el nombre del curso");
                        String nombrecurso = texto.nextLine();
                        referenciacatedratico = (Catedratico) deptomate.Getultimo();
                        referenciacatedratico.Agregarcurso(nombrecurso);
                        contador+=1;
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }

            }

            if (opcion == 2) {
                // pedimos al usuario que ingrese los datos del estudiante
                System.out.println("Ingrese el nombre del estudiante");
                String nombre = texto.nextLine();
                System.out.println("Ingrese el numero de carnet del estudiante");
                String nocarnet = texto.nextLine();
                System.out.println("Ingrese la constrasena del estudiante");
                String contrasena = texto.nextLine();

                try {
                    // validamos que no exista otra persona con el mismo numero de carnet
                    deptomate.Carnetduplicado(nocarnet);
                    // usamos el metodo agregar estudiante del departamento
                    System.out.println(deptomate.Agregarestudiante(nombre, nocarnet, contrasena));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            if (opcion == 3) {
                System.out.println("Ingrese una opcion");
                System.out.println("1. Catedratico");
                System.out.println("2. Estudiante");
                int opcion2 = numero.nextInt();

                if (opcion2==1) {
                      // pedimos al usuario que ingrese el numero de carnet
                      System.out.println("Ingrese el carnet del catedratico");
                      String nocarnetcatedratico = texto.nextLine();
                      try {
                          // validamos que exista una persona con el numero de carnet ingresado
                          deptomate.Validarnocarnet(nocarnetcatedratico);
                          // obtenemos la posicion que ocupa la persona en la lista de personas del departamento
                          int posicioncatedratico = deptomate.Getposicionpersona(nocarnetcatedratico);
                          // usamos el casting para tener obtener la instancia de persona como un estudiante 
                          referenciacatedratico = (Catedratico) deptomate.Getpersona(posicioncatedratico);
                          try {
                              System.out.println("Ingrese la contrasena del catedratico con carnet " + nocarnetcatedratico);
                              String contrasenacatedratico = texto.nextLine();
                              referenciacatedratico.Validarcontrasena(contrasenacatedratico);
                              // desplegamos un mensaje de bienvenida y pedimos que ingrese los datos de la cita 
                              System.out.println("Bienvenido " + referenciacatedratico.Getnombre());
                              System.out.println("Ingrese la fecha en que desea realizar la cita");
                              String fecha = texto.nextLine();
                              // obtenemos un array con todas las citas  agendadas en la fecha ingresada
                              segundoarrayintervalos = referenciacatedratico.Vercitasenfecha(fecha);
                              System.out.println("Ingrese la hora de inicio de la cita");
                              int horainicio = numero.nextInt();
                              System.out.println("Ingrese la hora final de la cita");
                              int horafinal = numero.nextInt();
                              System.out.println("Ingrese el numero de carnet del estudiante que desea citar");
                              String nocarnetestudiante = texto.nextLine();
                              try {
                                  // validamos que existe una persona con ese numero de carnet
                                  deptomate.Validarnocarnet(nocarnetestudiante);
                                  // obtenemos la posicion que ocupa el estudiante en la lista de personas
                                  int posicionestudiante = deptomate.Getposicionpersona(nocarnetestudiante);
                                  // usamos el casting
                                  referenciaestudiante = (Estudiante) deptomate.Getpersona(posicionestudiante);
                                  primerarraydeintervalos = referenciaestudiante.Vercitasenfecha(fecha);
                                  try {
                                      // validamos que la cita ingresada no coincida o interfiera con las otras citas del catedratico y estudiante en esa fecha
                                      referenciacatedratico.Validarcita(horainicio,horafinal,segundoarrayintervalos);
                                      referenciaestudiante.Validarcita(horainicio, horafinal, primerarraydeintervalos);
                                      // pedimos el curso a tratar
                                      System.out.println("Ingrese el curso a tratar");
                                      String nombrecurso = texto.nextLine();
                                      try {
                                          referenciacatedratico.Validarcurso(nombrecurso);
                                          referenciaintervalo = new Intervalo(horainicio, horafinal, fecha, nocarnetcatedratico, nocarnetestudiante,nombrecurso);
                                          referenciacatedratico.Agendarcita(referenciaintervalo);
                                          referenciaestudiante.Agendarcita(referenciaintervalo);
                                          System.out.println("Se ha agendado exitosamente la cita");
                                      } catch (Exception e) {
                                          System.out.println(e);
                                      }
  
                                  } catch (Exception e) {
                                      System.out.println(e);
                                  }
                              } catch (Exception e) {
                                  System.out.println(e);
                              }
  
                          } catch (Exception e) {
                              System.out.println(e);
                          }
  
                      } catch (Exception e) {
                          System.out.println(e);
                      }
                  
                }

                if (opcion2==2) {
                    // pedimos al usuario que ingrese el numero de carnet
                    System.out.println("Ingrese el carnet del estudiante");
                    String nocarnetestudiante = texto.nextLine();
                    try {
                        // validamos que exista una persona con el numero de carnet ingresado
                        deptomate.Validarnocarnet(nocarnetestudiante);
                        // obtenemos la posicion que ocupa la persona en la lista de personas del departamento
                        int posicionestudiante = deptomate.Getposicionpersona(nocarnetestudiante);
                        // usamos el casting para tener obtener la instancia de persona como un estudiante 
                        referenciaestudiante = (Estudiante) deptomate.Getpersona(posicionestudiante);
                        try {
                            System.out.println("Ingrese la contrasena del estudiante con carnet " + nocarnetestudiante);
                            String contrasenaestudiante = texto.nextLine();
                            referenciaestudiante.Validarcontrasena(contrasenaestudiante);
                            // desplegamos un mensaje de bienvenida y pedimos que ingrese los datos de la cita 
                            System.out.println("Bienvenido " + referenciaestudiante.Getnombre());
                            System.out.println("Ingrese la fecha en que desea realizar la cita");
                            String fecha = texto.nextLine();
                            // obtenemos un array con todas las citas  agendadas en la fecha ingresada
                            segundoarrayintervalos = referenciaestudiante.Vercitasenfecha(fecha);
                            System.out.println("Ingrese la hora de inicio de la cita");
                            int horainicio = numero.nextInt();
                            System.out.println("Ingrese la hora final de la cita");
                            int horafinal = numero.nextInt();
                            System.out.println("Ingrese el numero de carnet del catedratico que desea citar");
                            String nocarnetcatedratico = texto.nextLine();
                            try {
                                // validamos que existe una persona con ese numero de carnet
                                deptomate.Validarnocarnet(nocarnetcatedratico);
                                // obtenemos la posicion que ocupa el catedratico en la lista de personas
                                int posicioncatedratico = deptomate.Getposicionpersona(nocarnetcatedratico);
                                // usamos el casting
                                referenciacatedratico = (Catedratico) deptomate.Getpersona(posicioncatedratico);
                                primerarraydeintervalos = referenciacatedratico.Vercitasenfecha(fecha);
                                try {
                                    // validamos que la cita ingresada no coincida o interfiera con las otras citas del catedratico y estudiante en esa fecha
                                    referenciaestudiante.Validarcita(horainicio,horafinal,segundoarrayintervalos);
                                    referenciacatedratico.Validarcita(horainicio, horafinal, primerarraydeintervalos);
                                    // pedimos el curso a tratar
                                    System.out.println("Ingrese el curso a tratar");
                                    String nombrecurso = texto.nextLine();
                                    try {
                                        referenciacatedratico.Validarcurso(nombrecurso);
                                        referenciaintervalo = new Intervalo(horainicio, horafinal, fecha, nocarnetcatedratico, nocarnetestudiante,nombrecurso);
                                        referenciacatedratico.Agendarcita(referenciaintervalo);
                                        referenciaestudiante.Agendarcita(referenciaintervalo);
                                        System.out.println("Se ha agendado exitosamente la cita");
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }

                                } catch (Exception e) {
                                    System.out.println(e);
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }

                        } catch (Exception e) {
                            System.out.println(e);
                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
            
            if (opcion == 4) {
                // unicamente los catedraticos pueden cancelar una cita
                System.out.println("Ingrese el numero de carnet del catedratico");
                try {
                    String nocanrnetcatedratico = texto.nextLine();
                    deptomate.Validarnocarnet(nocanrnetcatedratico);
                    int posicioncatedratico = deptomate.Getposicionpersona(nocanrnetcatedratico);
                    referenciacatedratico = (Catedratico) deptomate.Getpersona(posicioncatedratico);
                    try {
                        System.out.println("Ingrese la contrasena del catedratico");
                        String contrasenacatedratico = texto.nextLine();
                        referenciacatedratico.Validarcontrasena(contrasenacatedratico);
                        //System.out.println("Ingrese el carnet del estudiante con quien tiene la cita a cancelar");
                        //String nocarnetestudiante = texto.nextLine();
                        //int posicionestudiante = deptomate.Getposicionpersona(nocarnetestudiante);
                        //referenciaestudiante = (Estudiante) deptomate.Getpersona(posicionestudiante);
                        System.out.println("Ingrese la fecha de la cita que desea cancelar");
                        String fecha = texto.nextLine();
                        primerarraydeintervalos = referenciacatedratico.Vercitasenfecha(fecha);
                        Collections.sort(primerarraydeintervalos);
                        int contador = 1;
                        System.out.println(" ");
                        System.out.println("Las citas de "+referenciacatedratico.Getnombre()+" en la fecha " + fecha + " son:");
                        for (Intervalo intervalo : primerarraydeintervalos) {
                            int posicionestudiante = deptomate.Getposicionpersona(intervalo.Getidestudiante());
                            referenciaestudiante = (Estudiante) deptomate.Getpersona(posicionestudiante);
                            System.out.println(contador  + ". Tiene cita con: " + referenciaestudiante.Getnombre() + " en horario de " + intervalo.Gethorainicio() + " a " + intervalo.Gethorafinal());
                            contador+=1;
                        }

                        System.out.println("Ingrese el numero de la cita que desea cancelar");
                        int numerocita = numero.nextInt()-1;
                        referenciaintervalo = primerarraydeintervalos.get(numerocita);
                        String nocarnetestudiante = referenciaintervalo.Getidestudiante();
                        int posicionestudiante = deptomate.Getposicionpersona(nocarnetestudiante);
                        referenciaestudiante = (Estudiante) deptomate.Getpersona(posicionestudiante);
                        // usamos el metodo cancelar cita de estudiante y catedratico para cancelar la cita en ambos objetos
                        referenciacatedratico.Cancelarcita(referenciaintervalo);
                        referenciaestudiante.Cancelarcita(referenciaintervalo);
                        System.out.println("Se ha cancelado la cita exitosamente");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            
            if (opcion == 5) {
                System.out.println("1. Catedratico");
                System.out.println("2. Estudiante");
                int opcion3 = numero.nextInt();

                if (opcion3==1) {
                    System.out.println("Ingrese el numero de carnet del catedratico");
                    String nocarnetcatedratico = texto.nextLine();
                    try {
                        deptomate.Validarnocarnet(nocarnetcatedratico);
                        int posicioncatedratico = deptomate.Getposicionpersona(nocarnetcatedratico);
                        referenciacatedratico = (Catedratico) deptomate.Getpersona(posicioncatedratico);
                        try {
                            System.out.println("Ingrese la contrasena de " + referenciacatedratico.Getnombre());
                            String contrasenacatedratico = texto.nextLine();
                            referenciacatedratico.Validarcontrasena(contrasenacatedratico);
                            System.out.println("Ingrese la fecha que desea consultar");
                            String fecha = texto.nextLine();
                            primerarraydeintervalos = referenciacatedratico.Vercitasenfecha(fecha);
                            Collections.sort(primerarraydeintervalos);
                            int contador = 1;
                            System.out.println(" ");
                            System.out.println("Las citas de " + referenciacatedratico.Getnombre() +" en la fecha " + fecha +" son:");
                            for (Intervalo intervalo : primerarraydeintervalos) {
                                int posicionestudiante = deptomate.Getposicionpersona(intervalo.Getidestudiante());
                                referenciaestudiante = (Estudiante) deptomate.Getpersona(posicionestudiante);
                                System.out.println(contador  + ". Tiene cita con: " + referenciaestudiante.Getnombre() + " en horario de " + intervalo.Gethorainicio() + " a " + intervalo.Gethorafinal());
                                contador+=1;
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }

                if (opcion3==2) {
                    System.out.println("Ingrese el numero de carnet del estudiante");
                    String nocarnetestudiante = texto.nextLine();
                    try {
                        deptomate.Validarnocarnet(nocarnetestudiante);
                        int posicionestudiante = deptomate.Getposicionpersona(nocarnetestudiante);
                        referenciaestudiante = (Estudiante) deptomate.Getpersona(posicionestudiante);
                        try {
                            System.out.println("Ingrese la contrasena de " + referenciaestudiante.Getnombre());
                            String contrasenaestudiante = texto.nextLine();
                            referenciaestudiante.Validarcontrasena(contrasenaestudiante);
                            System.out.println("Ingrese la fecha que desea consultar");
                            String fecha = texto.nextLine();
                            primerarraydeintervalos = referenciaestudiante.Vercitasenfecha(fecha);
                            Collections.sort(primerarraydeintervalos);
                            int contador = 1;
                            System.out.println(" ");
                            System.out.println("Las citas de " + referenciaestudiante.Getnombre() +" en la fecha " + fecha +" son:");
                            for (Intervalo intervalo : primerarraydeintervalos) {
                                int posicioncatedratico = deptomate.Getposicionpersona(intervalo.Getidcatedratico());
                                referenciacatedratico = (Catedratico) deptomate.Getpersona(posicioncatedratico);
                                System.out.println(contador  + ". Tiene cita con: " + referenciacatedratico.Getnombre() + " en horario de " + intervalo.Gethorainicio() + " a " + intervalo.Gethorafinal());
                                contador+=1;
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }
            }            
        }

        if (opcion ==6) {
            System.out.println("Ha elegido salir del programa");
            System.out.println("Adios.");
        }
    }
}