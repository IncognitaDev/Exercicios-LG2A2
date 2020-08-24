import java.util.ArrayList;

public class Professor extends Interno {

    public Professor(String name, String cpf, String prontuario){
        super(name,cpf,prontuario);
    }

    public void solicitarDisciplina(Disciplina disciplina) {
        if(temAgenda(disciplina)){
            if(disciplina.aceitarProfessor(this)){
                this.disciplinas.add(disciplina);
                System.out.println("Disciplina atribuida");
            }
            else{
                System.out.println("Não foi possivel atribuir disciplina");
            }
        }


    }

    public boolean AceitarDisciplina(Disciplina disciplina) {
        if(temAgenda(disciplina)){
            disciplinas.add(disciplina);
            return true;
        }
        return false;
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

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

}
