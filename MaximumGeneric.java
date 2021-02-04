public class MaximumGeneric {


    public Integer toPrint(Integer num1, Integer num2, Integer num3) {
        Integer maximum = num1;
        if (num2.compareTo(maximum)>0) {
            maximum = num2;
        }
        else if(num3.compareTo(maximum)>0)
        {
            maximum = num3;
        }
        return maximum;

    }
}
