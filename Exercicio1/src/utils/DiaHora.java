package utils;

public class DiaHora {

    private String diaDaSemana;
    private int horarioInicio;
    private int horarioFinal;

    public DiaHora(String diaDaSemana, int horarioInicio, int horarioFinal) {
        this.diaDaSemana = diaDaSemana;
        this.horarioInicio = horarioInicio;
        this.horarioFinal = horarioFinal;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public int getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(int horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public int getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(int horarioFinal) {
        this.horarioFinal = horarioFinal;
    }
}
