import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalcTest {

    SumCalculator sumCalculator;

    @BeforeEach
    void createNewObjectCalculator() {
     this.sumCalculator = new SumCalculator();
    }

    @Test
    public void oneValueTesting () throws IllegalAccessException {
       int result = sumCalculator.sum(1);
        Assertions.assertEquals(1, result);
    }


    @Test
    public void threeValueTesting () throws IllegalAccessException {
        int result = sumCalculator.sum(3);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void zeroValuetesting () throws IllegalAccessException {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });
    }

}
