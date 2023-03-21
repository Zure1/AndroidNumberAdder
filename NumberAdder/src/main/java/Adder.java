public class Adder {
    public int AddNumbers(int num1, int num2) throws Exception
    {
        if (num1 < 0 || num2 < 0) {
            throw new Exception("Both arguments must be positive numbers.");
        }

        return num1 + num2;
    }
}