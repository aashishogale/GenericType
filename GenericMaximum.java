import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class GenericMaximum<T extends Comparable<T>> {

    T a;
    T b;
    T c;
    ArrayList<T> array;

    public GenericMaximum() {
    }

    public GenericMaximum(ArrayList<T> t) {
       this.array = t;
    }

    public GenericMaximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Integer maxInteger(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {

            max = c;

        }
        return max;

    }

    public Double maxFloat(Double a, Double b, Double c) {
        Double max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {

            max = c;

        }
        return max;

    }

    public String maxString(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {

            max = c;

        }
        return max;

    }

    public <T extends Comparable<T>> T maxValue(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {

            max = c;

        }
        return max;

    }

    public T maxValue() {
        T max = this.a;
        if (this.b.compareTo(max) > 0) {
            max = this.b;
        }
        if (this.c.compareTo(max) > 0) {

            max = this.c;

        }
        return max;

    }

    public T maxArray() {
        return Collections.max(array);

    }


}
