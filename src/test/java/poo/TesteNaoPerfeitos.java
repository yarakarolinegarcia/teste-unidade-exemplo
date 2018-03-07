package poo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class TesteNaoPerfeitos {

    @Parameterized.Parameters(name = "{index}: perfeito({0}) = false")
    public static Object[] data() {
        return new Object[]{0,1,2,3,5,7,13, 200, 220, 1000 };
    }

    @Parameterized.Parameter
    public int entrada;

    @Test
    public void teste(){
        NumeroPerfeito np = new NumeroPerfeito();
        System.out.println(entrada);
        assertFalse(entrada + " é um número perfeito", np.numeroPerfeito(entrada));
    }

}
