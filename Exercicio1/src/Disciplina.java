public class Disciplina {
    private String name;
    private int id;
    private Professor[] professores;
    private Turma[] turmas;
    private Aluno[] listaAlunos;
    private String horario;
    private int professoresSolicitantes;
    private int alunosSolicitantes;


    public Disciplina(String name, int id, int nProfessores, String horario) {
        this.name = name;
        this.id = id;
        this.horario = horario;
        this.professores = new Professor[nProfessores];
        this.listaAlunos = new Aluno[nProfessores * 45];
        this.alunosSolicitantes = 0;
        this.professoresSolicitantes = 0;
    }

    public void aceitarAluno(Aluno aluno){
       if(this.alunosSolicitantes > this.listaAlunos.length) {
           this.listaAlunos[alunosSolicitantes] = aluno;
           this.alunosSolicitantes += 1;
       }
    }

    public boolean aceitarProfessor(Professor professor){
        if(this.professoresSolicitantes < this.professores.length ){
            this.professores[professoresSolicitantes] = professor;
            this.professoresSolicitantes += 1;
            return true;
        }
        else{
            System.out.println("O numero maximo de professores ja foi atingido");
            return false;
        }
    }


    public void solicitarProfessor(){

    }

    public void criarTurma() {
        for(int n = 0; n < this.professores.length ; n++){
            turmas[n] = new Turma(this.horario, this.listaAlunos, this.professores[n]);
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
}
