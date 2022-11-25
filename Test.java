/**
 * Test
 */

import java.util.ArrayList;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        // creamos una instancia de estudiante y de catedratico
        Estudiante estudiante1 = new Estudiante("Leonel", "18797", "Bichita123");
        Catedratico catedratico1 = new Catedratico("William", "18771", "ASDF");
        // creamos un intervalo
        Intervalo intervalo1 = new Intervalo(9,10,"22/11/2022","18771","18797","POO");

        Intervalo refenciaintervalo = new Intervalo();

        // creamos una instancia de scanner
        Scanner texto = new Scanner(System.in);

        estudiante1.Agendarcita(intervalo1);
        catedratico1.Agendarcita(intervalo1);
        System.out.println("Hasta ahorita bien");

        // obtenemos las citas en la fecha de hoy
        ArrayList<Intervalo> listaintervalos = estudiante1.Vercitasenfecha("22/11/2022");

        for (Intervalo intervalo : listaintervalos) {
            System.out.println(listaintervalos.indexOf(intervalo));
        }

        Intervalo intervalo2 = new Intervalo(7,8,"22/11/2022","18771","18797","POO");

        try {
            estudiante1.Validarcita(7, 8, listaintervalos);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            String contrasena = texto.nextLine();
            estudiante1.Validarcontrasena(contrasena);
            System.out.println("Si estaba correcta");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(estudiante1.Getcita(listaintervalos,0).Getidestudiante());


    }
}