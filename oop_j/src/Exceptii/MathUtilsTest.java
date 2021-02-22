package Exceptii;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTest {
    @Test
    public void testeazaAdunareNrPozitive(){
        int result = MathUtils.sum(2,4);
        Assert.assertEquals(6, result);
    }
    @Test
    public void testeazaAdunareNrNegative(){
        int result = MathUtils.sum(-2,-10);
        Assert.assertEquals(-12, result);
    }
    @Test
    public void testeazaScadereNrPozitive(){
        int result = MathUtils.scadere(9, 2);
        Assert.assertEquals(7, result);
    }

}
