public class Intervalo {
	 private int horarioInicio;
	  private int horarioFin;
	  private Persona persona;
	  private int estado;


	  public Intervalo(int horarioInicio, int horarioFin, Persona persona, int estado) {
		super();
		this.horarioInicio = horarioInicio;
		this.horarioFin = horarioFin;
		this.persona = persona;
		this.estado = estado; // 0: libre, 1: ocupado, 2: anulado
	}



	public int getHorarioInicio() {
		return horarioInicio;
	}



	public void setHorarioInicio(int horarioInicio) {
		this.horarioInicio = horarioInicio;
	}



	public int getHorarioFin() {
		return horarioFin;
	}



	public void setHorarioFin(int horarioFin) {
		this.horarioFin = horarioFin;
	}






	public Persona getPersona() {
		return persona;
	}



	public void setPersona(Persona persona) {
		this.persona = persona;
	}



	public int getEstado() {
		return estado;
	}



	public void setEstado(int estado) {
		this.estado = estado;
	}



	/**
	 *
	 */
	public Intervalo() {
		// TODO Auto-generated constructor stub




		}

}
