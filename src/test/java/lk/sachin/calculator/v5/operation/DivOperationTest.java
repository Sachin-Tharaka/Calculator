package lk.sachin.calculator.v5.operation;



import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThrows;

public class DivOperationTest {

    @Test
    public void should_divide_positive_values() throws InvalidOperationException {

        DivOperation devOperation = new DivOperation();
        Double result = devOperation.execute(new Double[]{18.0,6.0});

        assertThat(result, is(3.0));

    }

    @Test
    public void should_not_divide_by_zero() throws InvalidOperationException {

        DivOperation divOperation = new DivOperation();
        assertThrows(InvalidOperationException.class,()->{
            divOperation.execute(new Double[] {6.8,0.0});
        });



    }


}