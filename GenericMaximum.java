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

    public Double maxFloat(Double a, Double b, Double c){
        Double max = a;
        if (b > Math.max(a,c)) {
            max = b;
        }
        if (c > Math.max(a, b)) {

            max = c;

        }
        return max;

    }

    public Character maxString(Character a, Character b, Character c){
        Character max = a;
        if (b > Math.max(a,c)) {
            max = b;
        }
        if (c > Math.max(a, b)) {

            max = c;

        }
        return max;

    }


}
