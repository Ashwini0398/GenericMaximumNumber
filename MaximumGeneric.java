public class MaximumGeneric {

	public <E extends Comparable> E maximum(E num1 , E num2, E num3){
        E maximum = num1;
        if (num2.compareTo(maximum) > 0) {
            maximum = num2;
        }
        if (num3.compareTo(maximum) > 0) {
            maximum = num3;
        }
        printMax(maximum);
        return maximum;
    }
    public <E> void printMax(E maximum){
        System.out.println("Max Value = "+maximum);
    }





}
