import java.util.ArrayList;

public class Horario extends Intervalo {
    private ArrayList<Intervalo> intervalos;

    public Horario() {
 

        //Método
        intervalos = new ArrayList<Intervalo>();
            intervalos.add(horarioInicio.Intervalo);
            intervalos.add(horarioFin.Intervalo);
            intervalos.add(persona.Intervalo);
            intervalos.add(estado.Intervalo);
        
            //Sets y Gets
            public Intervalo getintervalos(){
                return intervalos;
            }
    
            public void setintervalos(Intervalo intervalos) {
                this.intervalos = intervalos;
            }
        
            
    }

}
