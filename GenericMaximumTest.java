import org.junit.Test;


public class GenericMaximumTest {

    @Test
    public  void maxInteger() {
        GenericMaximum  gm = new GenericMaximum();
        System.out.println(gm.maxInteger(1,2, 4));
        assert gm.maxInteger(1,2,3) == 3;
    }



}