public class Turma {

    private String horario;
    private Aluno[] alunos;
    private Professor professor;

    public Turma(String horario, Aluno[] alunos, Professor professor) {
        this.horario = horario;
        this.alunos = alunos;
        this.professor = professor;
    }

    public void aceitarMatricula() {

    }

    public void removerMatricula(){

    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
