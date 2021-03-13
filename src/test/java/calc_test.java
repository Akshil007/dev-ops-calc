import static org.junit.Assert.*;
import org.junit.Test;
public class calc_test {
    private static final double DELTA = 1e-15;
    calc cal=new calc();
    @Test
    public void sqrtTruePositive(){
        assertEquals("sqrt of number for True Positive", 2, calc.sqrt(4),DELTA);
    }

    @Test
    public void sqrtFalsePositive(){
        assertNotEquals("sqrt of integer number for False Positive", 3, calc.sqrt(4),DELTA);
    }

    @Test
    public void factTruePositive(){
        assertEquals("factorial of number for True Positive", 24, calc.fact(4),DELTA);
    }

    @Test
    public void factFalsePositive(){
        assertNotEquals("factorial of integer number for False Positive", 23, calc.fact(4),DELTA);
    }

    @Test
    public void nlogTruePositive(){
        assertEquals("natural log of number for True Positive", 0, calc.n_log(1),DELTA);
    }

    @Test
    public void nlogFalsePositive(){
        assertNotEquals("natural log of integer number for False Positive", 2, calc.n_log(1),DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("power of number for True Positive", 8, calc.power(2,3),DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("power of integer number for False Positive", 2, calc.power(2,4),DELTA);
    }

}
