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
