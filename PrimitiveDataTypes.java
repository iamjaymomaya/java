public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Integer range is (-2147483648 <=> 2147483647)
        System.out.println("Integer range is (" + Integer.MIN_VALUE + " <=> " + Integer.MAX_VALUE + ")");

        // Byte range is (-128 <=> 127)
        System.out.println("Byte range is (" + Byte.MIN_VALUE + " <=> " + Byte.MAX_VALUE + ")");

        // Short range is (-32768 <=> 32767)
        System.out.println("Short range is (" + Short.MIN_VALUE + " <=> " + Short.MAX_VALUE + ")");

        // Long range is (-9223372036854775808 <=> 9223372036854775807)
        System.out.println("Long range is (" + Long.MIN_VALUE + " <=> " + Long.MAX_VALUE + ")");
        System.out.println("The size of long is " + Long.SIZE);

        long myLongVar = 100l;

        System.out.println(myLongVar);
        // THis will give error
        long myLongLiteral = 1000000;
        myLongLiteral = 12221222;
        System.out.println(myLongLiteral);
    }
}