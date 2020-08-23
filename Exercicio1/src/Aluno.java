public class Aluno {
    private String name;
    private String prontuario;
    private String cpf;

    public Aluno(String name, String prontuario, String cpf){
        this.name = name;
        this.prontuario = prontuario;
        this.cpf = cpf;
    }

    private void solicitarMatricula(){
        
    }

    private void cancelarMatricula(){

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
