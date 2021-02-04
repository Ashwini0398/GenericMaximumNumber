import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    MaximumGeneric max= new MaximumGeneric();

    @Test
    public void givenFirstNumberIsMaximum()
    {
        Integer num1 = max.toPrint(24,12,10);
        Assert.assertEquals((Integer) 24,num1);
    }

    @Test
    public void givenSecondNumberIsMaximum()
    {
        Integer num2 = max.toPrint(24,38,10);
        Assert.assertEquals((Integer) 38,num2);
    }

    @Test
    public void givenThirdNumberIsMaximum()
    {
        Integer num3 = max.toPrint(24,12,78);
        Assert.assertEquals((Integer) 78,num3);
    }

}
