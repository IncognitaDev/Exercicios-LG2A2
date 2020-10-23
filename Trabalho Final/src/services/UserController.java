package services;

import perfis.*;

import java.util.ArrayList;

public class UserController{
    private ArrayList<Usuario> usuarios;

  public Usuario login(String email, String senha){
        for( Usuario usuario : usuarios ){
            if(usuario.getEmail() == email){
                if(usuario.getSenha() == senha){
                    return usuario;
                }
            }
        }
      System.out.println("Email ou senha incorretos");
        return  null;
  }

  public void criarUsuario(Usuario usuario){
      usuarios.add(usuario);
  }

  public void mudarPrazo(Papel p, int prazo){
        if(p instanceof Aluno){
            Aluno.setPrazoEntrega(prazo);
        }else if (p instanceof Professor){
            Professor.setPrazoEntrega(prazo);
        }else if (p instanceof Bibliotecario){
            Bibliotecario.setPrazoEntrega(prazo);
        }else if (p instanceof Diretor){
            Diretor.setPrazoEntrega(prazo);
        }
    }
}