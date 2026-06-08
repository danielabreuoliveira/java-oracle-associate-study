package academy.javaoca.danieloliveira.poo.dominio27.servicos;

import academy.javaoca.danieloliveira.poo.dominio27.repositorio.Autenticavel;

public class SistemaLogin {
    public static void realizarLogin(Autenticavel usuario, String senha){
        System.out.println("Login");

        if(usuario.autenticar(senha)){
            System.out.println("Login realizado com sucesso");
        }else{
            System.out.println("Login inválido");
        }
    }
}
