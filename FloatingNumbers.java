public class FloatingNumbers
{
    public static void main(String[] args)
    {
        // Float range is (1.4E-45 <=> 3.4028235E38)
        System.out.println("Float range is (" + Float.MIN_VALUE + " <=> " + Float.MAX_VALUE + ")");

        // Double range is (4.9E-324 <=> 1.7976931348623157E308)
        System.out.println("Double range is (" + Double.MIN_VALUE + " <=> " + Double.MAX_VALUE + ")");

        float floatVar = 5.0f;
        double doubleVar = 5.0; 

        System.out.println("Float Var: " + floatVar);

        System.out.println("Double Var: " + doubleVar);
    }
}