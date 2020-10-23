package perfis;

public class Usuario extends Pessoa {

    protected Papel papel;
    protected String email;
    protected String senha;
    protected String prontuario;

    public Usuario(String nome, String sobrenome, Papel papel, String email, String senha, String prontuario) {
        super(nome, sobrenome);
        this.papel = papel;
        this.email = email;
        this.senha = senha;
        this.prontuario = prontuario;
    }


    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
}
