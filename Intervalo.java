/**
 * Intervalo es la clase que modela los intervalos de las reuniones
 * @author Leonel Contreras 18797
 * @version 1.0
 */

public class Intervalo implements Comparable<Intervalo>{

	// atributos
	private int horainicio;
	private int horafinal;
	private String fecha;
	private boolean estado;
	private String idcatedratico;
	private String idestudiante;
	private String curso;

	// metodos

	/** Intervalo es el constructor sin parametros de la clase */

	public  Intervalo() {
		
	}

	/** Intervalo es el constructor de la clase. Hace overloading al constructor anterior
	 * @param horainicio es un int que indica la hora de inicio de la reunion
	 * @param horafinal es un int que indica la hora en que finaliza la reunion
	 * @param fecha es un String que indica la fecha en que se realizara la reunion
	 * @param idcatedratico es un String que representa el id del catedratico
	 * @param idestudiante es un String que representa el id del estudiante
	 * @param curso es un String que representa el curso a tratar en la reunion
	 */

	 public  Intervalo(int horainicio, int horafinal, String fecha, String idcatedratico, String idestudiante, String curso) {
		 this.horainicio = horainicio;
		 this.horafinal = horafinal;
		 this.fecha = fecha;
		 this.idcatedratico = idcatedratico;
		 this.idestudiante = idestudiante;
		 this.curso = curso;
	 }

	 // set y get hora inicio
	 public void Sethorainicio(int horainicio) {
		 this.horainicio = horainicio;
	 }

	 public int Gethorainicio() {
		 return this.horainicio;
	 }

	 // set y get hora final
	 public void Sethorafinal(int horafinal) {
		 this.horafinal = horafinal;
	 }

	 public int Gethorafinal() {
		 return this.horafinal;
	 }

	 // set y get fecha 
	 public void Setfecha(String fecha) {
		 this.fecha = fecha;
	 }

	 public String Getfecha() {
		 return this.fecha;
	 }

	 // set y get idcatedratico
	 public void Setidcatedratico(String idcatedratico) {
		 this.idcatedratico = idcatedratico;
	 }

	 public String Getidcatedratico() {
		 return this.idcatedratico;
	 }

	 // set y get idestudiante 
	 public void Setidestudiante(String idestudiante) {
		 this.idestudiante = idestudiante;
	 }

	 public String Getidestudiante() {
		 return this.idestudiante;
	 }

	 // set y get curso
	 public void Setcurso(String curso) {
		 this.curso = curso;
	 }

	 public String Getcurso() {
		 return this.curso;
	 }

	 // set y get estado
	 public void Setestado(boolean estado) {
		 this.estado = estado;
	 }

	 public boolean Getestado() {
		 return this.estado;
	 }

	 @Override
	 public int compareTo(Intervalo intervalo) {
		if(horainicio == intervalo.horainicio){
            return 0;
        }else if(horainicio < intervalo.horainicio){
            return -1;
        }else{
            return 1;
        }
	 }
}
