import utils.DiaHora;

import java.util.ArrayList;

public class Aluno extends Interno {

    public Aluno(String name, String prontuario, String cpf){
        super(name,prontuario,cpf);
    }

    public void solicitarDisciplina(Disciplina disciplina){
        if(temAgenda(disciplina)) {
            if (disciplina.aceitarAluno(this)) {
                this.disciplinas.add(disciplina);
            }else{
                System.out.println("Não Foi Possivel Matricular");
            }
            return;
        }
    }

    public void cancelarMatricula(Disciplina disciplina){
        if(disciplina.removerAluno(this)){
            for (Disciplina disciplinaSolicitada: this.disciplinas) {
                if(disciplinaSolicitada.getId() == disciplina.getId()){
                    this.disciplinas.remove(disciplina);
                    return;
                }
            }
        }
    }

    public boolean temAgenda(Disciplina disciplina){
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

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
