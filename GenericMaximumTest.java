import org.junit.Assert;
import org.junit.Test;


public class GenericMaximumTest {

    @Test
    public  void test_first_integer_from_generic_maximum() {

        GenericMaximum  gen_max = new GenericMaximum();
        Assert.assertSame(3, gen_max.maxInteger(3,2,1));
    }

    @Test
    public  void second_first_integer_from_generic_maximum() {

        GenericMaximum  gen_max = new GenericMaximum();
        Assert.assertSame(2, gen_max.maxInteger(1,2,1));
    }





}