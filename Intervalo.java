public class Intervalo {
	 private int horarioInicio;
	  private int horarioFin;
	  private Persona persona;
	  private bolean estado;


	  public Intervalo(int horarioInicio, int horarioFin, Persona persona, bolean estado) {
		super();
		this.horarioInicio = horarioInicio;
		this.horarioFin = horarioFin;
		this.persona = persona;
		this.estado = estado;
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



	public bolean getEstado() {
		return estado;
	}



	public void setEstado(bolean estado) {
		this.estado = estado;
	}



	/**
	 *
	 */
	public Intervalo() {
		// TODO Auto-generated constructor stub




		}

}
