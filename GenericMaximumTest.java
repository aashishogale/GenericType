import org.junit.Assert;
import org.junit.Test;


public class GenericMaximumTest {

    @Test
    public  void test_max_integer_from_generic_maximum() {

        GenericMaximum  gen_max = new GenericMaximum();
        Assert.assertSame(3, gen_max.maxInteger(1,2,3));
    }



}