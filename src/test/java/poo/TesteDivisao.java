package poo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import java.util.Dictionary;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TesteDivisao {
    @Parameterized.Parameters(name = "{index}: divisao({0},{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 2, 2, 1 },
                {22, 2, 11 },
                {-2, 2, -1 },

        });
    }
    @Parameterized.Parameter(0)
    public int operandoUm;

    @Parameterized.Parameter(1)
    public int operandoDois;

    @Parameterized.Parameter(2)
    public double resultado;

    @Test
    public void teste(){
        Divisao obj = new Divisao();
        assertEquals("resultado errado.",resultado, obj.divisao(operandoUm, operandoDois),5);
    }
}
