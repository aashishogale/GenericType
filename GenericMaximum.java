public class GenericMaximum {

    public Integer maxInteger(Integer a, Integer b, Integer c){
        Integer max = a;
        if (b > Math.max(a,c)) {
            max = b;
        }
        if (c > Math.max(a, b)) {

            max = c;

        }
        return max;

    }


}
