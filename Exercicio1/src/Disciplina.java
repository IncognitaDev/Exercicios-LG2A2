public class Disciplina {
    private String name;
    private int id;
    private Turma[] turmas;
    private Professor[] professores;

    private void aceitarAluno(){

    }

    private void aceitarDisciplina(){

    }

    private void solicitarProfessor(){

    }

    private void criarTurma() {

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

    public Turma[] getTurmas() {
        return turmas;
    }

    public void setTurmas(Turma[] turmas) {
        this.turmas = turmas;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
