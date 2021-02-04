import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    MaximumGeneric max= new MaximumGeneric();

    @Test
    public void givenFirstNumberIsMaximum()
    {
        Integer num1 = max.maximum(24,12,10);
        Assert.assertEquals((Integer) 24,num1);
    }

    @Test
    public void givenSecondNumberIsMaximum()
    {
        Integer num2 = max.maximum(24,38,10);
        Assert.assertEquals((Integer) 38,num2);
    }

    @Test
    public void givenThirdNumberIsMaximum()
    {
        Integer num3 = max.maximum(24,12,78);
        Assert.assertEquals((Integer) 78,num3);
    }

    @Test
    public void givenFirstNumberFloatIsMaximum()
    {
        Float num4 = max.maximum( 3.4f , 2.3f ,2.4f );
        Assert.assertEquals((Float) 3.4f,num4);
    }

    @Test
    public void givenSecondNumberFloatIsMaximum()
    {
        Float num5 = max.maximum( 3.4f , 4.3f ,2.4f );
        Assert.assertEquals((Float) 4.3f,num5);
    }

    @Test
    public void givenThirdNumberFloatIsMaximum()
    {
        Float num6 = max.maximum( 3.4f , 2.3f ,4.4f );
        Assert.assertEquals((Float) 4.4f,num6);
    }

    @Test
    public void givenFirstNumberStringIsMaximum()
    {
        String num7 = max.maximum( "PINEAPPLE" , "PEN" , "PAPER" );
        Assert.assertEquals((String) "PINEAPPLE",num7);
    }

    @Test
    public void givenSecondNumberStringIsMaximum()
    {
        String num8 = max.maximum(  "PEN", "PINEAPPLE" , "PAPER" );
        Assert.assertEquals((String) "PINEAPPLE",num8);
    }

    @Test
    public void givenThirdNumberStringIsMaximum()
    {
        String num9 = max.maximum(  "PEN", "PINEAPPLE" , "POMOGRANATE" );
        Assert.assertEquals((String) "POMOGRANATE",num9);
    }
}
