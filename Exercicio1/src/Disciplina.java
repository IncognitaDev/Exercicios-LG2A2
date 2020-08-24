import utils.DiaHora;

import java.util.ArrayList;

public class Disciplina {
    private String name;
    private int id;
    private Professor[] professores;
    private ArrayList<Aluno> listaAlunos;
    private DiaHora horario;
    private int professoresSolicitantes;


    public Disciplina(String name, int id, DiaHora horario) {
        this.name = name;
        this.id = id;
        this.horario = horario;
        this.professores = new Professor[2];
        this.professoresSolicitantes = 0;
        this.listaAlunos = new ArrayList<Aluno>();
    }

    public boolean aceitarAluno(Aluno aluno){
       if(this.listaAlunos.size()<= this.professores.length * 45) {
           this.listaAlunos.add(aluno);
           System.out.println("Aluno Matriculado");
           return true;
       }else{
           System.out.printf("Não foi possivel matricular aluno");
           return false;
       }
    }

    public boolean removerAluno(Aluno alunoSolicitante){
        for (Aluno aluno: this.listaAlunos) {
            if(aluno.getProntuario().equals(alunoSolicitante.getProntuario())){
                aluno = null;
                System.out.println("aluno desmatriculado com sucesso");
                return true ;
            }
        }
        System.out.println("aluno não encontrado");
        return false;
    }

    public boolean aceitarProfessor(Professor professor){
        if(this.professoresSolicitantes < 2){
            this.professores[professoresSolicitantes] = professor;
            this.professoresSolicitantes += 1;
            return true;
        }
        else{
            System.out.println("O numero maximo de professores ja foi atingido");
            return false;
        }
    }

    public void solicitarProfessor(Professor professor){
       if(professor.AceitarDisciplina(this)){
           this.professores[professoresSolicitantes] = professor;
       }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public DiaHora getHorario() {
        return horario;
    }

    public void setHorario(DiaHora horario) {
        this.horario = horario;
    }
}
