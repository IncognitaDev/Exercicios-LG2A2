
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
