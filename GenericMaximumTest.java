import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class GenericMaximumTest {

    GenericMaximum gen_max = new GenericMaximum();

    GenericMaximum gen_max_params = new GenericMaximum(1, 2, 3);

    @Test
    public void test_first_integer_from_generic_maximum() {
        Assert.assertSame(3, gen_max.maxInteger(3, 2, 1));
    }

    @Test
    public void test_second_integer_from_generic_maximum() {
        Assert.assertSame(2, gen_max.maxInteger(1, 2, 1));
    }

    @Test
    public void test_third_integer_from_generic_maximum() {
        Assert.assertSame(3, gen_max.maxInteger(1, 2, 3));
    }

    @Test
    public void test_first_float_from_generic_maximum() {
        Assert.assertEquals(3.0, gen_max.maxFloat(3.0, 2.0, 1.0), 0.0f);
    }

    @Test
    public void test_second_float_from_generic_maximum() {
        Assert.assertEquals(2.0, gen_max.maxFloat(1.0, 2.0, 1.0), 0.0f);
    }

    @Test
    public void test_third_float_from_generic_maximum() {
        Assert.assertEquals(3.0, gen_max.maxFloat(1.0, 2.0, 3.0), 0.0f);
    }

    @Test
    public void test_first_string_from_generic_maximum() {
        Assert.assertSame("Peach", gen_max.maxString("Apple", "Banana", "Peach"));
    }

    @Test
    public void test_second_string_from_generic_maximum() {
        Assert.assertSame("Peach", gen_max.maxString("Apple", "Peach", "Banana"));
    }

    @Test
    public void test_third_string_from_generic_maximum() {
        Assert.assertSame("Peach", gen_max.maxString("Apple", "Banana", "Peach"));
    }

    @Test
    public void test_first_value_from_generic_maximum() {
        Assert.assertSame('c', gen_max.maxValue('a', 'b', 'c'));
    }

    @Test
    public void test_second_value_from_generic_maximum() {
        Assert.assertEquals(2.0, gen_max.maxValue(1.0, 2.0, 1.0));
    }

    @Test
    public void test_third_value_from_generic_maximum() {
        Assert.assertEquals(3, gen_max.maxValue(1, 2, 3));
    }

    @Test
    public void test_params_from_generic_maximum() {
        Assert.assertEquals(3, gen_max_params.maxValue());
    }

    @Test
    public void test_params_from_generic_maximum_array() {
        ArrayList<String> array = new ArrayList<String>();
        array.add("Banana");
        array.add("Peach");
        GenericMaximum generalarray = new GenericMaximum(array);
        Assert.assertEquals("Peach", generalarray.maxArray());
    }




}