import org.junit.Assert;
import org.junit.Test;

public class GenericMaximumTest {

    GenericMaximum  gen_max = new GenericMaximum();

    @Test
    public  void test_first_integer_from_generic_maximum() {
        Assert.assertSame(3, gen_max.maxInteger(3,2,1));
    }

    @Test
    public  void second_first_integer_from_generic_maximum() {
        Assert.assertSame(2, gen_max.maxInteger(1,2,1));
    }

    @Test
    public  void third_first_integer_from_generic_maximum() {
        Assert.assertSame(3, gen_max.maxInteger(1,2,3));
    }

}