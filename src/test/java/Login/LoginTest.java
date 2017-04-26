package Login;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author 253496
 */
public class LoginTest {
        
    @Test
     public void Teste() {
         Login login = new Login();
         
         String senha  = "01234";
         String cadastro = "Cadastrado!";
         
         
         String retornoFeito1 = login.verificaLimiteSenha(senha);
         assertEquals(senha,retornoFeito1);
         
         String retornoFeito2 = login.verificaForcaSenha(senha);         
         assertEquals(senha, retornoFeito2);
         
         String retornoFeito3 = login.validaSenha(senha);
         assertEquals(cadastro, retornoFeito3);;
         
     }
}
