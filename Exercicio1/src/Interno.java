import utils.DiaHora;

import java.util.ArrayList;

public abstract class Interno {
    protected String name;
    protected String cpf;
    protected String prontuario;
    protected ArrayList<Disciplina> disciplinas;

    public Interno(String name, String cpf, String prontuario) {
        this.name = name;
        this.cpf = cpf;
        this.prontuario = prontuario;
        disciplinas = new ArrayList<Disciplina>();
    }

    protected boolean temAgenda(Disciplina disciplina){
        DiaHora horarioDisciplinaSolicitada = disciplina.getHorario();
        for (Disciplina disciplinaAtual: disciplinas) {
            DiaHora horarioDisciplinaAtual = disciplinaAtual.getHorario();
            if(horarioDisciplinaAtual.getDiaDaSemana().equals(horarioDisciplinaSolicitada.getDiaDaSemana())){
                if(horarioDisciplinaAtual.getHorarioFinal() > horarioDisciplinaSolicitada.getHorarioInicio()){
                    System.out.println("Conflito de horario");
                    return false;
                }
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
}
