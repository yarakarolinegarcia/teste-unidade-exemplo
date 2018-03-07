package poo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TesteSoma {

    @Parameterized.Parameters(name = "{index}: soma({0},{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0, 0 },
                { 0, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 2 },
                {-1, 1, 0 },
                {1, -1, 0 },
                {-1,-1,-2 }
        });
    }

    @Parameterized.Parameter(0)
    public int operandoUm;

    @Parameterized.Parameter(1)
    public int operandoDois;

    @Parameterized.Parameter(2)
    public int resultado;

    @Test
    public void teste(){
        SomaInteiros obj = new SomaInteiros();
        assertEquals("resultado errado.",resultado, obj.soma(operandoUm, operandoDois));
    }
}
