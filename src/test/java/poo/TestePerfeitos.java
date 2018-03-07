package poo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertTrue;


@RunWith(Parameterized.class)
public class TestePerfeitos {


    @Parameterized.Parameters(name = "{index}: perfeito({0}) = true")
    public static Object[] data() {
        return new Object[]{6, 28, 496, 8128};
    }

    @Parameterized.Parameter(0)
    public int entrada;

    @Test
    public void teste(){
        NumeroPerfeito np = new NumeroPerfeito();
        assertTrue(entrada + " não é um número perfeito", np.numeroPerfeito(entrada));
    }

}
