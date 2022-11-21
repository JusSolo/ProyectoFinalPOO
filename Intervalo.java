/**
 * Intervalo es la clase que modela los intervalos de las reuniones
 * @author Leonel Contreras 18797
 * @version 1.0
 */

public class Intervalo {

	// atributos
	private int horainicio;
	private int horafinal;
	private String fecha;
	private boolean estado;
	//private Catedratico catedratico;
	//private Estudiante estudiante;
	private String curso;

	// metodos

	/** Intervalo es el constructor de la clase. 
	 * @param horainicio es un int que indica la hora de inicio de la reunion
	 * @param horafinal es un int que indica la hora en que finaliza la reunion
	 * @param fecha es un String que indica la fecha en que se realizara la reunion
	 * @param catedratico es un objeto de tipo Catedratico que representa al catedratico que estara en la reunion
	 * @param estudiante es un objeto de tipo Estudiante que representa al estudiante que estara en la reunion
	 * @param curso es un String que representa el curso a tratar en la reunion
	 */

	 public  Intervalo(int horainicio, int horafinal, String fecha, Catedratico catedratico, Estudiante estudiante, String curso) {
		 this.horainicio = horainicio;
		 this.horafinal = horafinal;
		 this.fecha = fecha;
		 //this.catedratico = catedratico;
		 //this.estudiante = estudiante;
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

	 /*// set y get catedratico
	 public void Setcatedratico(Catedratico catedratico) {
		 this.catedratico = catedratico;
	 }

	 public Catedratico getcatedratico() {
		 return this.catedratico;
	 }*/

	 /*// set y get estudiante
	 public void Setestudiante(Estudiante estudiante) {
		 this.estudiante = estudiante;
	 }

	 public Estudiante Getestudiante() {
		 return this.estudiante;
	 }*/

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
}
