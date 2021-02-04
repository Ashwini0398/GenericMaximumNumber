import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {


    @Test
    public void givenFirstNumberIntegerIsMaximum()
    {
        Integer[] intergerValues ={ 24, 1, 2 };
        Integer max = new MaximumGeneric<>(intergerValues).max();
        Assert.assertEquals((Integer) 24, max);
    }

    @Test
    public void givenSecondNumberIntegerIsMaximum()
    {
        Integer[] intergerValues = { 24, 38, 10 };
        Integer max = new MaximumGeneric<>(intergerValues).max();
        Assert.assertEquals((Integer) 38,max);
    }

    @Test
    public void givenThirdNumberIntegerIsMaximum()
    {
        Integer[] intergerValues =  { 24, 12, 40 };
        Integer max = new MaximumGeneric<>(intergerValues).max();
        Assert.assertEquals((Integer) 40,max);
    }
    @Test
    public void givenFirstNumberFloatIsMaximum()
    {
        Float[] floatValues ={20f, 2f, 1f};
        Float max = new MaximumGeneric<>(floatValues).max();
        Assert.assertEquals((Float) 20f, max);
    }

    @Test
    public void givenSecondNumberFloatIsMaximum()
    {
        Float[] floatValues ={ 3f, 36f, 1f };
        Float max = new MaximumGeneric<>(floatValues).max();
        Assert.assertEquals((Float) 36f, max);
    }

    @Test
    public void givenThirdNumberFloatIsMaximum()
    {
        Float[] floatValues ={ 3f, 1f, 36f };
        Float max = new MaximumGeneric<>(floatValues).max();
        Assert.assertEquals((Float) 36f, max);
    }

    @Test
    public void givenFirstNumberStringIsMaximum()
    {
        String[] stringValues ={ "PINEAPPLE" ,"PEN",  "PAPER"};
        String max = new MaximumGeneric<>(stringValues).max();
        Assert.assertEquals( "PINEAPPLE" , max);
    }

    @Test
    public void givenSecondNumberStringIsMaximum()
    {
        String[] stringValues ={ "PEN", "PINEAPPLE" , "PAPER"};
        String max = new MaximumGeneric<>(stringValues).max();
        Assert.assertEquals( "PINEAPPLE" ,max);
    }

    @Test
    public void givenThirdNumberStringIsMaximum()
    {
        String[] stringValues ={ "PEN",  "PAPER", "PINEAPPLE" };
        String max = new MaximumGeneric<>(stringValues).max();
        Assert.assertEquals("PINEAPPLE" , max);
    }
}
