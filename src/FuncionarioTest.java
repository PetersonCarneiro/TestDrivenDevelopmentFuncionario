import lombok.Data;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FuncionarioTest {
    private Funcionario funcionario1;
    private Funcionario funcionario2;
    private Funcionario funcionario3;
    private double salDesc=0;

    @Before
    public void newEmployee(){
        this.funcionario1 = new Funcionario("Pedro","pedro@gmail.com",5000,"dev",salDesc);
        this.funcionario2 = new Funcionario("Luiz","luiz@gmail.com",2500,"Gerente",salDesc);
        this.funcionario3 = new Funcionario("Junior","junior@gmail.com",550,"test",salDesc);
    }
    @Test
    public void funcionarioTestDev(){
        assertEquals(4000,funcionario1.verificaFunc(),0.00001);
    }
    @Test
    public void funcionarioTestGerente(){
        assertEquals(2000,funcionario2.verificaFunc(),0.00001);
    }
    @Test
    public void funcionarioTestTestador(){
        assertEquals(467.5,funcionario3.verificaFunc(),0.00001);
    }

}
