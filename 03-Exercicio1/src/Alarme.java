
import java.time.LocalTime;

public class Alarme {
    private String nomeAlarme;
    private LocalTime horarioAlarme;
    private boolean alarmeAtivado;
    private  Tom tomAlarme;


    public int adicionarAlarme(String nomeAlarme, LocalTime horarioAlarme){
        this.nomeAlarme = nomeAlarme;
        this.horarioAlarme = horarioAlarme;
        System.out.println("Alarme " + nomeAlarme + " criado para o horário "+ horarioAlarme);
        return 0;
    }

    public int ativarAlarme(String nomeAlarme){
        System.out.println("Alarme " + nomeAlarme + " ativado e tocará ás " + horarioAlarme);
        return 0;
    }

    public String getNomeAlarme() {
        return nomeAlarme;
    }

    public void setNomeAlarme(String nomeAlarme) {
        this.nomeAlarme = nomeAlarme;
    }

    public LocalTime getHorarioAlarme() {
        return horarioAlarme;
    }

    public void setHorarioAlarme(LocalTime horarioAlarme) {
        this.horarioAlarme = horarioAlarme;
    }

    public boolean isAlarmeAtivado() {
        return alarmeAtivado;
    }

    public void setAlarmeAtivado(boolean alarmeAtivado) {
        this.alarmeAtivado = alarmeAtivado;
    }

    public Tom getTomAlarme() {
        return tomAlarme;
    }

    public void setTomAlarme(Tom tomAlarme) {
        this.tomAlarme = tomAlarme;
    }
}
