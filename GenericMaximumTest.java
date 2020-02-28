import org.junit.Assert;
import org.junit.Test;

public class GenericMaximumTest {

    GenericMaximum  gen_max = new GenericMaximum();

    @Test
    public  void test_first_integer_from_generic_maximum() {
        Assert.assertSame(3, gen_max.maxInteger(3,2,1));
    }

    @Test
    public  void test_second_integer_from_generic_maximum() {
        Assert.assertSame(2, gen_max.maxInteger(1,2,1));
    }

    @Test
    public  void test_third_integer_from_generic_maximum() {
        Assert.assertSame(3, gen_max.maxInteger(1,2,3));
    }
    @Test
    public  void test_first_float_from_generic_maximum() {
        Assert.assertEquals(3.0, gen_max.maxFloat(3.0,2.0,1.0), 0.0f);
    }

    @Test
    public  void test_second_float_from_generic_maximum() {
        Assert.assertEquals(2.0, gen_max.maxFloat(1.0,2.0,1.0), 0.0f);
    }

    @Test
    public  void test_third_float_from_generic_maximum() {
        Assert.assertEquals(3.0, gen_max.maxFloat(1.0,2.0,3.0), 0.0f);
    }


}