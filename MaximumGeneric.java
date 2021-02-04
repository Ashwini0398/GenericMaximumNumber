public class MaximumGeneric <E extends Comparable<E>>
{
    E[] value;

    public MaximumGeneric(E[] value) {

        this.value = value;
    }

    public <E> void printMax(E maximum) {
        System.out.println("Max Value = " + maximum);
    }

    public E max() {
        if (value[0].compareTo(value[1]) > 0 && value[0].compareTo(value[2]) > 0) {
            printMax(value[0]);
        } else if (value[1].compareTo(value[0]) > 0 && value[1].compareTo(value[2]) > 0) {
            printMax(value[1]);
        } else {
            printMax(value[2]);

        }
        return value[2];
    }
}
