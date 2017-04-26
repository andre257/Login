/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author 253496
 */
public class Login {

    public String verificaLimiteSenha(String senha) {
        if (senha.length() > 6) 
            return "Senha muito longa!";
         else
            return senha;
    }
    public String verificaForcaSenha(String senha){
        if(senha.length() <= 4) 
            return "Senha fraca!";
        else
            return senha;
    }
    public String validaSenha(String senha){
        if((verificaForcaSenha(senha) == null ? senha == null : verificaForcaSenha(senha).equals(senha)) 
                && (verificaLimiteSenha(senha) == null ? senha == null : verificaLimiteSenha(senha).equals(senha)))
            return "Cadastrado!";
        else
            return "Erro!";
    }
}
