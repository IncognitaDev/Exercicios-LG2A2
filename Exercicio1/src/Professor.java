public class Professor {

    private String name;
    private String cpf;
    private String prontuario;
    private Disciplina[] disciplinas;

    private Professor(String name, String cpf, String prontuario){

    }

    private void solicitarDisciplina() {

    }

    private void AceitarDisciplina() {

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

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }
}
