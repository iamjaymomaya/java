public class Casting
{
    public static void main(String[] args)
    {
        byte byteVar = 10;

        short shortVar = 100;

        int intVar = 1000;
     
        byte myByteSum = (byte)(byteVar + shortVar + intVar);
        
        System.out.println(myByteSum);
    }
}